package com.atiguigu.bigdata.spark

import java.util

import org.apache.spark.rdd.RDD
import org.apache.spark.util.AccumulatorV2
import org.apache.spark.{SparkConf, SparkContext}

import scala.util.parsing.json.JSON

object Spark_json11 {
  def main(args: Array[String]): Unit = {
    val config: SparkConf = new SparkConf().setMaster("local[*]").setAppName("af")
    val sc=new SparkContext(config)
    val json: RDD[String] = sc.textFile("in/user.json")
    val result: RDD[Option[Any]] = json.map(JSON.parseFull)
    result.foreach(println)
//    sc.longAccumulator()
    sc.stop()



  }

}



//class word extends AccumulatorV2[String,util.ArrayList[String]]{






