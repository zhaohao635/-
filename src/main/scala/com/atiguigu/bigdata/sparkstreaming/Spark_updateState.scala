package com.atiguigu.bigdata.sparkstreaming

import org.apache.spark.SparkConf
import org.apache.spark.streaming.dstream.{DStream, ReceiverInputDStream}
import org.apache.spark.streaming.kafka.KafkaUtils
import org.apache.spark.streaming.{Seconds, StreamingContext}

object Spark_updateState {
  def main(args: Array[String]): Unit = {
    //使用SparkStreaming完成WordCount
    //Spark配置对象
    val sparkConf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("SparkStreamingWordCount")
    //实时数据分析环境对象
    val streamingContext = new StreamingContext(sparkConf, Seconds(10))
    //保存数据的状态，需要设定检查点的路径，因为数据是源源不断的，所以要写到本地文件，不能放在内存当中
    streamingContext.sparkContext.setCheckpointDir("jianchadianlujing")
    //从Kafka中采集数据
    val kafkaDStream: ReceiverInputDStream[(String, String)] = KafkaUtils.createStream(
      streamingContext,
      "node1:2181",
      "atiguigu",
      Map("atiguigu" -> 3)
    )
    //将采集的数据进行分解（扁平化）
    val wordDStream: DStream[String] = kafkaDStream.flatMap(t => t._2.split(" "))
    //将数据进行结构的转换方便统计分析
    val mapDStream: DStream[(String, Int)] = wordDStream.map((_, 1))
    //将转换结构后的数据进行聚合处理
    // val wordToSumDStream: DStream[(String, Int)] = mapDStream.reduceByKey(_ + _)
    //与之前的差别在于之前使用reduceByKey现在使用updateStateByKey，其他位置就是增加一个检查点路径，剩下的都一样
    val stateDStream: DStream[(String, Int)] = mapDStream.updateStateByKey {
      case (seq, buffer) => {
        val sum = buffer.getOrElse(0) + seq.sum //初始值如果不存在则使用默认值0
        Option(sum) //返回值为一个Option
      }
    }
    //将结果打印出来
    stateDStream.print()
    //自动采集器
    streamingContext.start()
    //Driver等待采集器的执行
    streamingContext.awaitTermination()
  }

}
