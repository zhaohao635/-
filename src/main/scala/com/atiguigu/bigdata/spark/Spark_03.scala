package com.atiguigu.bigdata.spark

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark_03 {
  def main(args: Array[String]): Unit = {
    val config: SparkConf = new SparkConf().setMaster("local[*]").setAppName("af")
    val sc=new SparkContext(config)
//    val listRDD: RDD[Int] = sc.makeRDD(1 to 10, 2)
//    val tupleRDD: RDD[(Int, String)] = listRDD.mapPartitionsWithIndex {
//      case (num, datas) => {
//        datas.map((_, "分区号" + num))
//      }
//    }
//    tupleRDD.collect().foreach(println)
    //flatmap的用法
    val listRDD: RDD[List[Int]] = sc.makeRDD(Array(List(1, 2), List(3, 4)))
    val flatMapRDD: RDD[Int] = listRDD.flatMap(data => data)
    flatMapRDD.collect().foreach(println)

  }

}








