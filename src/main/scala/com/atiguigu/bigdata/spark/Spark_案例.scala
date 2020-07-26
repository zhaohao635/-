package com.atiguigu.bigdata.spark

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark_案例 {
  def main(args: Array[String]): Unit = {
    val config: SparkConf = new SparkConf().setMaster("local[*]").setAppName("af")
    val sc=new SparkContext(config)
    val lines: RDD[String] = sc.textFile("in\\agent.log")
    val provinceAdToOne: RDD[((String, String), Int)] = lines.map { x =>
      val fields: Array[String] = x.split(" ")
      ((fields(1), fields(3)), 1)
    }
    val provinceAdToSum: RDD[((String, String), Int)] = provinceAdToOne.reduceByKey(_ + _)
    val provinceToAdSum: RDD[(String, (String, Int))] = provinceAdToSum.map(x => (x._1._1, (x._1._2, x._2)))
    val provinceGroup: RDD[(String, Iterable[(String, Int)])] = provinceToAdSum.groupByKey()
    val top3: RDD[(String, List[(String, Int)])] = provinceGroup.mapValues { x =>
      x.toList.sortWith((x, y) => x._2 > y._2).take(3)

    }
    top3.collect().foreach(println)
    sc.stop()





  }

}








