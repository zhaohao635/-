package com.atiguigu.bigdata.spark

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark_10 {
  def main(args: Array[String]): Unit = {
    val config: SparkConf = new SparkConf().setMaster("local[*]").setAppName("af")
    val sc=new SparkContext(config)
//    val rdd: RDD[(Int, Int)] = sc.parallelize(List((1, 3), (1, 2), (1, 4), (2, 3), (3, 6), (3, 8)), 3)
//    val a: RDD[(Int, Int)] = rdd.foldByKey(0)(_ + _)
    val ad: RDD[(String, Int)] = sc.parallelize(List(("we", 3), ("we", 2), ("we", 4), ("web", 3), ("wq", 6), ("wq", 8)), 3)
    val ade: RDD[(String, Int)] = ad.foldByKey(0)(_ + _)
//    ad.combineByKey((_,1),(acc:(Int,Int),v)=>(acc._1+v,acc._2+1))
//    CompactBuffer



  }

}








