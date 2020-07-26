package com.atiguigu.bigdata.sparksql

import org.apache.spark.SparkConf
import org.apache.spark.sql.{DataFrame, SparkSession}

object Spark01 {
  def main(args: Array[String]): Unit = {
    //创建配置对象
    val sparkconf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("spark01")
    //创建spark SQL的环境对象
    val spark: SparkSession = SparkSession.builder().config(sparkconf).getOrCreate()
    //读取数据，构建dataframe
    val frame: DataFrame = spark.read.json("in/user.json")
    //展示数据
    frame.show()
    spark.stop()
  }

}
