package com.atiguigu.bigdata.sparksql

import org.apache.spark.SparkConf
import org.apache.spark.sql.{DataFrame, SparkSession}

object Spark01_sql {
  def main(args: Array[String]): Unit = {
    //创建配置对象
    val sparkconf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("spark01")
    //创建spark SQL的环境对象
    val spark: SparkSession = SparkSession.builder().config(sparkconf).getOrCreate()
    //读取数据，构建dataframe
    val frame: DataFrame = spark.read.json("in/user.json")
    //转换为一张表
    frame.createOrReplaceTempView("user")
    spark.sql("select age from user").show()
    spark.stop()
  }

}
