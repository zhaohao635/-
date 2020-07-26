package com.atiguigu.bigdata.spark

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark_05 {
  def main(args: Array[String]): Unit = {
    val config: SparkConf = new SparkConf().setMaster("local[*]").setAppName("af")
    val sc=new SparkContext(config)
    //生成数据，按照指定的规则进行分组
    //分组后的数据形成了对偶元组（K-V),K表示分组的key V表示分组的数据集合
    val listRDD: RDD[Int] = sc.makeRDD(List(1, 2, 3, 4))
    val groupbyRDD: RDD[(Int, Iterable[Int])] = listRDD.groupBy(_ % 2)
    groupbyRDD.collect().foreach(println)
    //按照指定的规则过滤
    val filterRDD: RDD[Int] = listRDD.filter(x => x % 2 == 0)
    filterRDD.collect().foreach(println)



  }

}








