package scalaTest.test1

import scala.collection.immutable

class Test {

}
object Test{
  def main(args: Array[String]): Unit = {
//    multiTable()

    for (col <- 1 to 9) yield {
      val prod = (9 * col).toString
      val padding = " " * (4 - prod.length())
      col + "*" + 9 + "=" + prod + padding
    }.mkString

    val str = for (row <- 1 to 9) yield{
      for (col <- 1 to row) yield {
        val prod = (row * col).toString()
        val padding = " " * (4 - prod.length())
        col + "*" + row + "=" + prod + padding
      }.mkString
    }.mkString("\n")
    println()


  }

  //打印：打印乘法口诀发
  def makeRowSeq(row: Int): immutable.IndexedSeq[String] =
    for (col <- 1 to row) yield {
    val prod = (row * col).toString()
    val padding = " " * (4 - prod.length())
    col + "*" + row + "=" + prod + padding
  }
  def makeRow(row: Int) = makeRowSeq(row).mkString
  /*函数风格的编程实现九九乘法表*/
  def multiTable(): Unit = {
    val tableSeq = for (row <- 1 to 9) yield makeRow(row)
    println(tableSeq.mkString("\n"))
  }
}
