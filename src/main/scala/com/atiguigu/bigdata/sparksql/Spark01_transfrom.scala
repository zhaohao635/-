package com.atiguigu.bigdata.sparksql

import org.apache.spark.SparkConf
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.{DataFrame, Dataset, Row, SparkSession}

object Spark01_transfrom {
  def main(args: Array[String]): Unit = {
    //创建配置对象
    val sparkconf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("spark01")
    //创建spark SQL的环境对象
    val spark: SparkSession = SparkSession.builder().config(sparkconf).getOrCreate()
    import spark.implicits._
    //创建RDD
    val rdd: RDD[(Int, String, Int)] = spark.sparkContext.makeRDD(List((1, "zhangsan", 20), (2, "lisi", 30)))
    //转换为df
    val df: DataFrame = rdd.toDF("id", "name", "age")
    //转换为DS
    val ds: Dataset[User] = df.as[User]
    //转换为DF
    val df1: DataFrame = ds.toDF()
    //转换为RDD
    val rdd1: RDD[Row] = df1.rdd
    rdd1.foreach(row=>{
      println(row.getString(1))
    })

    spark.stop()
  }

}
case class User(id:Int,name:String,age:Int)
