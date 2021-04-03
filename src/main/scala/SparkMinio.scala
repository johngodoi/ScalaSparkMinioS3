package com.johngodoi.scala.sparkminios3

import org.apache.spark.sql.{Row, SQLContext}
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.types.{DoubleType, StringType, StructField, StructType}

object SparkMinio extends App {
  private val conf: SparkConf = (new SparkConf()).setAppName("Spark Minio Test")
    .set("spark.hadoop.fs.s3a.endpoint", "http://localhost:9000/")
    .set("spark.hadoop.fs.s3a.access.key", "minioadmin")
    .set("spark.hadoop.fs.s3a.secret.key", "minioadmin")
    .set("spark.hadoop.fs.s3a.path.style.access", "true")
    .set("spark.hadoop.fs.s3a.impl", "org.apache.hadoop.fs.s3a.S3AFileSystem")
    .setMaster("local[*]")

  private val sc:SparkContext = new SparkContext(conf)
  private val sqlContext = new SQLContext(sc)


  println(sc.wholeTextFiles("s3a://rawlayer/test.txt").collect().mkString)

  val path = "s3a://rawlayer/mario-colors-two2/"
  val rowsRdd = sc.parallelize(
    Seq(
      Row("first", 2.0, 7.0),
      Row("second", 3.5, 2.5),
      Row("third", 7.0, 5.9)
    )
  )
  val schema = new StructType()
    .add(StructField("id", StringType, nullable = true))
    .add(StructField("val1", DoubleType, nullable = true))
    .add(StructField("val2", DoubleType, nullable = true))
  sqlContext.createDataFrame(rowsRdd, schema).write.csv(path)

  sc.stop()

  System.exit(0)

}