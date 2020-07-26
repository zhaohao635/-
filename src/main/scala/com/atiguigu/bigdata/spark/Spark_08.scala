package com.atiguigu.bigdata.spark

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark_08 {
  def main(args: Array[String]): Unit = {
    val config: SparkConf = new SparkConf().setMaster("local[*]").setAppName("af")
    val sc=new SparkContext(config)
    val listRDD: RDD[Int] = sc.makeRDD(1 to 16, 4)
    println("缩减前分区="+listRDD.partitions.size)
    //缩减分区可以简单的理解为合并分区
    val coalesceRDD: RDD[Int] = listRDD.coalesce(2)
    println("缩减后的分区="+coalesceRDD.partitions.size)
    coalesceRDD.saveAsTextFile("output")



  }

}








