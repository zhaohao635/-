package com.atiguigu.bigdata.spark

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark_06 {
  def main(args: Array[String]): Unit = {
    val config: SparkConf = new SparkConf().setMaster("local[*]").setAppName("af")
    val sc=new SparkContext(config)
    //从指定的数据集合中进行抽样处理，根据不同的算法进行抽样
    val listRDD: RDD[Int] = sc.makeRDD(1 to 10)
    //fraction表示随机取出来的概率大于0.4的，并不是取出来的百分比
    val sampleRDD: RDD[Int] = listRDD.sample(false, 0.4, 2)
    val sampleRDD1: RDD[Int] = listRDD.sample(true, 5, 2)
    sampleRDD.collect().foreach(println)
    sampleRDD1.collect().foreach(println)



  }

}








