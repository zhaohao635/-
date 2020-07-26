package com.atiguigu.bigdata.sparkstreaming

import org.apache.spark.SparkConf
import org.apache.spark.streaming.dstream.{DStream, ReceiverInputDStream}
import org.apache.spark.streaming.{Seconds, StreamingContext}

object Spark_WordCount {
  def main(args: Array[String]): Unit = {
    //使用SparkStreaming完成WordCount
    //Spark配置对象
    val sparkConf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("SparkStreamingWordCount")
    //实时数据分析环境对象
    val streamingContext = new StreamingContext(sparkConf, Seconds(10))
    //从指定的端口中采集数据
    val socketLineDStream: ReceiverInputDStream[String] = streamingContext.socketTextStream("node1", 9999)
    //将采集的数据进行分解（扁平化）
    val wordDStream: DStream[String] = socketLineDStream.flatMap(line => line.split(" "))
    //将数据进行结构的转换方便统计分析
    val mapDStream: DStream[(String, Int)] = wordDStream.map((_, 1))
    //将转换结构后的数据进行聚合处理
    val wordToSumDStream: DStream[(String, Int)] = mapDStream.reduceByKey(_ + _)
    //将结果打印出来
    wordToSumDStream.print()
    //自动采集器
    streamingContext.start()
    //Driver等待采集器的执行
    streamingContext.awaitTermination()
  }

}
