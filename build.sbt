name := "ScalaSparkMinioS3"

version := "0.1"

scalaVersion := "2.12.13"

idePackagePrefix := Some("com.johngodoi.scala.sparkminios3")

libraryDependencies += "com.amazonaws" % "aws-java-sdk" % "1.10.6"
libraryDependencies += "com.amazonaws" % "aws-java-sdk-s3" % "1.10.6"
libraryDependencies += "org.apache.hadoop" % "hadoop-common" % "3.2.1"
libraryDependencies += "org.apache.hadoop" % "hadoop-aws" % "3.2.1"
libraryDependencies += "org.apache.spark" %% "spark-core" % "3.0.0"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.0.0"
