package scalaTest.test2

import scala.collection.JavaConverters._
import scala.collection.mutable

class I_List[T <: Any]{

}
object I_List{
  var values: Array[Any] = Array[Any]()

//  def map(f: (Int) => Int): Array[Any] = {
//    for (i <- values.indices) values(i) = f
//    values
//  }

//  def map(f: (Int) => String): Array[Any] = {
//    for (i <- values.indices) values(i) = f.apply(_)
//    values
//  }

  def map(f: Any => Any): Array[Any] = {
    for (i <- values.indices) values(i) = f(values(i))
    values
  }

  def main(args: Array[String]): Unit = {
    List

    values = Array(1,2,3,4,54,56)
    val f = (x: Int) => "xx = " + x*2
    val v1 = map(x => x + "   xx ")
    val l = List(1,2,5,5,56,76,7)
    for (i <- v1.indices) println(v1.apply(i))

//    def values(fun: (Int) => Int, low: Int, high: Int) = {
//      for(v <- low to high) yield (v, fun(v))
//    }
//
//    val result = values(x => x * x, -5, 5)
//    println( result )

  }


//  def map(f: (Any) => Any):  Array[Any] = {
//    for (i <- values.indices) values(i) = f
//    values
//  }


}
