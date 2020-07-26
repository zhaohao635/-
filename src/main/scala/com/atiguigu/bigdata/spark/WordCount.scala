package com.atiguigu.bigdata.spark

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object WordCount {
  def main(args: Array[String]): Unit = {
    val config = new SparkConf().setMaster("local[*]").setAppName("wordcount")
    val sc = new SparkContext(config)
    val lines: RDD[String] = sc.textFile("in")
    val words = lines.flatMap(_.split(" "))
    val wordToOne = words.map((_,1))
    val wordToSum = wordToOne.reduceByKey(_+_)
    val result = wordToSum.collect()
    result.foreach(println)

  }

}
