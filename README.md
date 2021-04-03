# ScalaSparkMinioS3

The code contained in this repository shows how to setup a [MinIO](https://docs.min.io/), 
using [docker-compose](https://docs.docker.com/compose/), and how to create an [Apache Spark](http://spark.apache.org/) 
job capable of read and write on it.

The Apache Spark code is going to execute in embedded mode, setting master to local, using all computing resources available.

This code can be used as a template in order to setup Spark to work along with MinIO in Scala.

This repository is partially based on this [tutorial](https://www.jitsejan.com/setting-up-Spark-with-minio-as-object-storage.html). 

## Requirements

In order to execute this code, you are going to need:

* sbt
* Java 8+
* docker
* on Windows:
    * setup winutil.exe and hadoop.dll, like [here](https://sparkbyexamples.com/spark/spark-hadoop-exception-in-thread-main-java-lang-unsatisfiedlinkerror-org-apache-hadoop-io-nativeio-nativeiowindows-access0ljava-lang-stringiz/).


## Setting up services before running the code
```shell
docker-compose up -d #starting minio
```
