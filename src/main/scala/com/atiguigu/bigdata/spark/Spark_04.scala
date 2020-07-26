package com.atiguigu.bigdata.spark

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark_04 {
  def main(args: Array[String]): Unit = {
    val config: SparkConf = new SparkConf().setMaster("local[*]").setAppName("af")
    val sc=new SparkContext(config)
    val listRDD: RDD[Int] = sc.makeRDD(List(1, 5, 8, 75, 2, 3, 15, 4), 3)
    //将一个分区的数据放到一个数组中
    val glomRDD: RDD[Array[Int]] = listRDD.glom()
    glomRDD.collect().foreach(array=>{
      println(array.mkString(","))
    })



  }

}








