package learm1

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by zhoujun on 2017/9/1.
  */
class SparkLearm {

}

object SparkLearm{
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("ScalaLearm")
      .setMaster("spark://192.168.27.132:7077")
      .setJars(Array("E:\\IDEA-Projects\\ScalaLearm\\out\\artifacts\\ScalaLearm_jar\\ScalaLearm.jar"))
    val sc = new SparkContext(conf)
    val input = sc.textFile("hdfs://192.168.27.132:9000/testSpark/testIn.txt")
    val words = input.flatMap(line => line.split(" "))
    val counts = words.map(word => (word, 1)).reduceByKey{case (x, y) => x + y}
    counts.collect().foreach(println)
    counts.foreach(println)
//    counts.saveAsObjectFile("hdfs://192.168.27.132:9000/testSpark/testOut.txt")

  }
}
