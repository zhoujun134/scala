package scalaTest.test2

import scala.reflect.ClassTag
class MyList[T: ClassTag]{

  var values: Array[T] = Array[T]()

  /**
    * 带参数够着函数
    * @param arr 数组
    */
  def this(arr: Array[T]){
    this()
    values = arr
  }

  /**
    * 设置出事数组
    * @param arr 要设置数组
    */
  def setValues(arr: Array[T]): Unit = values = arr

  /**
    * map 函数 用于将一个集合中的元素类型转换为另一种类型
    * @param f Function1转换函数
    * @return
    */
  def map(f: T => Any): Array[Any] = {
    var tmp = Array[Any]()
    for (i <- values.indices) tmp = tmp ++ Array(f(values(i)))
    tmp
  }

  /**
    * reduce 函数  归约操作
    * @param f 归约执行的函数
    * @return
    */
  def reduce(f: (T, T) => T): Any ={
    var value = values(0)
    for(i <- 1 until values.length) value = f(value, values(i))
    value
  }

}

object MyList{
  def main(args: Array[String]): Unit = {
    val myList = new MyList[Int](Array(1,2,3,4,5,6,7,8,9))
    val arr = myList.map((x: Int) => "x=  "+ x)
    println("Method of map of MyList test result is ===> ")
    for(i <- arr) println(i)
    println("Method of reduce of MyList method test result is  ===>")
    val sum = myList.reduce((x, y) => x+y)
    println("sum = " + sum)


  }

}
