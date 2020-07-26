package com.atiguigu.bigdata.spark

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark_01 {
  def main(args: Array[String]): Unit = {
    val config: SparkConf = new SparkConf().setMaster("local[*]").setAppName("wordcount")
    val sc = new SparkContext(config)
    val listRDD: RDD[String] = sc.makeRDD(List("1", "2", "3", "4"))
//    sc.textFile(args(0)).flatMap(_.split(" ")).map((_,1)).reduceByKey(_+_,1)
//      .sortBy(_._2,false).saveAsTextFile(args(1))

//    自定义分区个数
//    val listRDD: RDD[String] = sc.makeRDD(List("1", "2", "3", "4"),2)
//    z直接在终端中打印
//    listRDD.collect().foreach(println)
//    val listRDD: RDD[String] = sc.textFile("in",2)
    listRDD.collect().foreach(println)
//    listRDD.saveAsTextFile("output")
  }

}
