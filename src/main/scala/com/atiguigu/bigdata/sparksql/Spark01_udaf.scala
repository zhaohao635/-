package com.atiguigu.bigdata.sparksql

import org.apache.spark.{SparkConf, TaskContext}
import org.apache.spark.rdd.RDD
import org.apache.spark.sql.expressions.{Aggregator, MutableAggregationBuffer, UserDefinedAggregateFunction}
import org.apache.spark.sql.types.{DataType, StructType}
import org.apache.spark.sql.{Column, DataFrame, Dataset, Encoder, Encoders, Row, SparkSession, TypedColumn}

object Spark01_udaf {
  def main(args: Array[String]): Unit = {
    //创建配置对象
    val sparkconf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("spark01")
    //创建spark SQL的环境对象
    val spark: SparkSession = SparkSession.builder().config(sparkconf).getOrCreate()
    import spark.implicits._
    //创建RDD
//    val rdd: RDD[(Int, String, Int)] = spark.sparkContext.makeRDD(List((1, "zhangsan", 20), (2, "lisi", 30)))
    //创建聚合函数对象
    val udaf = new myave
    //将聚合函数转换为查询列
    val avgCol: TypedColumn[UserBean, Double] = udaf.toColumn.name("avge")
    val frame: DataFrame = spark.read.json("in/user.json")
    val userDS: Dataset[UserBean] = frame.as[UserBean]
    userDS.select(avgCol).show()
    spark.stop()
  }

}

case class UserBean(name:String,age:BigInt)
case class AvgBuffer(var sum:BigInt,var count:Int)

/**
 * 用户自定义聚合函数（强类型）
 * 继承Aggregator，设定泛型
 * 实现方法
 */
class myave extends Aggregator[UserBean,AvgBuffer,Double] {
  //初始化
  override def zero: AvgBuffer = {
    AvgBuffer(0,0)
  }

  /**
   *聚合函数,分区内的聚合操作
   * @param b ：是缓冲区存在的数据
   * @param a：是新来的每一组的值
   * @return
   */
  override def reduce(b: AvgBuffer, a: UserBean): AvgBuffer = {
    b.sum = b.sum+a.age
    b.count = b.count +1
    b
  }
  //缓冲区的合并，分区间的交互，那么就是buffer与buffer之间的交互
  override def merge(b1: AvgBuffer, b2: AvgBuffer): AvgBuffer = {
    b1.sum = b1.sum+b2.sum
    b1.count = b2.count+b1.count
    b1
  }
  //完成计算
  override def finish(reduction: AvgBuffer): Double = {
    reduction.sum.toDouble/reduction.count
  }

  override def bufferEncoder: Encoder[AvgBuffer] = Encoders.product

  override def outputEncoder: Encoder[Double] = Encoders.scalaDouble
}

