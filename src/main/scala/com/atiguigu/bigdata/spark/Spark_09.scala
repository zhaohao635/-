package com.atiguigu.bigdata.spark

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark_09 {
  def main(args: Array[String]): Unit = {
    val config: SparkConf = new SparkConf().setMaster("local[*]").setAppName("af")
    val sc=new SparkContext(config)
    val rdd: RDD[(String, Int)] = sc.makeRDD(List(("female", 2), ("male", 3), ("female", 5), ("male", 6)))
//    val value: RDD[(String, Int)] = rdd.reduceByKey((x, y) => (x + y))
    val value: RDD[(String, Int)] = rdd.reduceByKey(_+_)
    value.collect().foreach(println)



  }

}








