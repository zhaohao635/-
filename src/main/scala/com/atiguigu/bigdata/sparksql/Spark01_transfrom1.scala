package com.atiguigu.bigdata.sparksql

import org.apache.spark.SparkConf
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.{DataFrame, Dataset, Row, SparkSession}

object Spark01_transfrom1 {
  def main(args: Array[String]): Unit = {
    //创建配置对象
    val sparkconf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("spark01")
    //创建spark SQL的环境对象
    val spark: SparkSession = SparkSession.builder().config(sparkconf).getOrCreate()
    import spark.implicits._
    //创建RDD
    val rdd: RDD[(Int, String, Int)] = spark.sparkContext.makeRDD(List((1, "zhangsan", 20), (2, "lisi", 30)))
    val userds: Dataset[User] = rdd.map {
      case (id, name, age) => {
        User(id, name, age)
      }
    }.toDS()
    val rdd1: RDD[User] = userds.rdd
    rdd1.foreach(println)

    spark.stop()
  }

}

