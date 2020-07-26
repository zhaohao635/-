package com.atiguigu.bigdata.spark

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark_02oper {
  def main(args: Array[String]): Unit = {
    val config: SparkConf = new SparkConf().setMaster("local[*]").setAppName("mapoper")
    val sc = new SparkContext(config)
    val map1: RDD[Int] = sc.makeRDD(1 to 10)
    val mapRDD: RDD[Int] = map1.map(_ * 2)
    mapRDD.collect().foreach(println)

  }

}
