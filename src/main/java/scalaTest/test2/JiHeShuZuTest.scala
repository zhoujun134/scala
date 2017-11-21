package scalaTest.test2

import scala.collection.mutable

class JiHeShuZuTest {

}

object JiHeShuZuTest{
  def main(args: Array[String]): Unit = {
//    arrTest()
//    listTest()
//    tuplTest()
//    mapTest()
//    setTest()

    val f = (x:Int, y:Int) => x + y
    Function
    println(sum(f))
    println(sum((x, y)=>x*y))
//    val f2 = sum._
  }

  def sum(fx:(Int, Int) => Int): Int ={
    val a =4
    val b =5
    fx(a,b)
  }

  def arrTest():Unit={

    //创建一个数组
    val arr1 = Array[Int](1,2,3,4)

    val arr2 = Array(2l,12,2,4,5,6)
    var arr3 = Array(1,2,2,3,4,45,5)
    arr2(2) = 13
    //打印数组
    println(arr1)

    for(i <- arr1) println(i)
    println("************arr2")
    for(i <- arr2) println(i)

    println(arr2)
    //取出第一个元素
    println(arr1(0))


    val numbers = Array(1, 2, 3, 4) //声明一个数组对象
    val first = numbers(0) // 读取第一个元素
    numbers(3) = 100 // 替换第四个元素为100
    val biggerNumbers = numbers.map(_ * 2) // 所有元素乘2

    for(i <- biggerNumbers) println(i)

  }

  def tuplTest():Unit={
    val t = Tuple3(1, "hello", Console)
//    val t = (1, "hello", Console)

    println(t._1)
    println(t._2)

  }

  def listTest(): Unit ={
    val list = List(1,2,3,42)
    val list2 = 1 :: 2 :: 3 :: 4 :: Nil

    val x = list.head
    val y = list(3)
    val z = list.take(3)
    val z2 = list.apply(3)
    val min = list.max
    val max = list.min

    println("x= "+ x +" y= "+ y +" z= "+ z + " z2= " +z2)
    println("min= " + min +"  max=" + max)

    val left = List(1,2,3)
    val right = List(4,5,6)

    //以下操作等价
    println("1 *******")
    println(left ++ right)   // List(1,2,3,4,5,6)
    println(left ++: right)  // List(1,2,3,4,5,6)

    println("2 right.++:(left) *******")
    println(right.++:(left))  // List(1,2,3,4,5,6)

    println(" 3 right.:::(left *******")
    println(right.:::(left))// List(1,2,3,4,5,6)

    println("4 0 +: left 和 left.+:(0) *******")
    //以下操作等价
    println( 0 +: left) //List(0,1,2,3)
    println(left.+:(0)) //List(0,1,2,3)

    println("5 left :+ 4 *******")
    //以下操作等价

    println(left :+ 4)    //List(1,2,3,4)
    println(left.:+(4))   //List(1,2,3,4)

    println("6 0 :: left *******")
    //以下操作等价
    println(0 :: left)      //List(0,1,2,3)
    println(left.::(0))     //List(0,1,2,3)

  }

  def setTest(): Unit ={
    val set = Set(1,2,3)
    println(set.getClass.getName) //

    println(set.exists(_ % 2 == 0)) //true
    println(set.drop(1)) //Set(2,3)

    import scala.collection.mutable.Set // 可以在任何地方引入 可变集合

    val mutableSet = mutable.Set(1,2,3)
    println(mutableSet.getClass.getName) // scala.collection.mutable.HashSet

    mutableSet.add(4)
    mutableSet.remove(1)
    mutableSet += 5
    mutableSet -= 2

    println(mutableSet) // Set(5, 3, 4)

    val another = mutableSet.toSet
    println(another.getClass.getName) // scala.collection.immutable.Set
  }
  def mapTest(): Unit ={
    println("******************不可变map")
    val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF")
//    val colors = Map[String,String]("red" -> "#FF0000", "azure" -> "#F0FFFF")
    println(colors)
    val nums: Map[Int, Int] = Map()

    println( "colors 中的键为 : " + colors.keys )
    println( "colors 中的值为 : " + colors.values )
    println( "检测 colors 是否为空 : " + colors.isEmpty )
    println( "检测 nums 是否为空 : " + nums.isEmpty )
    println(" 遍历 colors *******")
    colors.keys.foreach{ i =>
      print( "Key = " + i )
      println(" Value = " + colors(i) )}


    println("*********************8可变map")
    import scala.collection.mutable.Map
    val A:mutable.Map[String, String] = mutable.Map()
    A += ("xxx" -> "zhangshan")
    A += ("xx2" -> "w1")
    A += ("xx3" -> "r3")

    println(A)

  }

}