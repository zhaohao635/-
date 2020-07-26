package com.atiguigu.bigdata.spark

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark_07 {
  def main(args: Array[String]): Unit = {
    val config: SparkConf = new SparkConf().setMaster("local[*]").setAppName("af")
    val sc=new SparkContext(config)
    val listRDD: RDD[Int] = sc.makeRDD(List(1, 2, 1, 5, 2, 9, 6, 1))
//    val distinctRDD: RDD[Int] = listRDD.distinct()
    //在使用distinct算子对数据去重，但是因为去重后会导致数据减少，所以可以改变默认分区的数量
    val distinctRDD: RDD[Int] = listRDD.distinct(2)
    distinctRDD.saveAsTextFile("OUTPUT")




  }

}








