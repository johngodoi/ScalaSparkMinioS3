name := "ScalaSparkMinioS3"

version := "0.1"

scalaVersion := "2.12.13"

libraryDependencies += "com.amazonaws" % "aws-java-sdk" % "1.11.375"
libraryDependencies += "com.amazonaws" % "aws-java-sdk-s3" % "1.11.375"
libraryDependencies += "org.apache.hadoop" % "hadoop-common" % "3.2.1"
libraryDependencies += "org.apache.hadoop" % "hadoop-aws" % "3.2.1"
libraryDependencies += "org.apache.spark" %% "spark-core" % "3.0.0"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.0.0"
