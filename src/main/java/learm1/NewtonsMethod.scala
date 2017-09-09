package learm1

/**
  * Created by zhoujun on 2017/9/9.
  */
class NewtonsMethod {

}

object NewtonsMethod{

  def main(args: Array[String]): Unit = {
//    driver
    val testList = List(12,211,12,2,1,2,12)

    testList.foreach(println)

    println("除去重复的元素和转换为 double。。。")
    testList.distinct
      .map( i => i.toDouble)
      .foreach(println)
  }

  def driver: Unit ={
    val fx = (x: Double) => 3*x + math.sin(x) - math.pow(math.E, x)
    val fxPrime = (x : Double) => 3 + math.cos(x) - math.pow(Math.E, x)
    val InitialGuess = 0.0
    val toLearms = 0.00005

    val answer = newtonsMethos(fx, fxPrime, InitialGuess, toLearms)
    println(answer)
  }


  def newtonsMethos(fx: Double => Double,
                    fxPrime: Double => Double,
                    x: Double,
                    toLearms: Double): Double ={
    var x1 = x
    var xNext =  newtonsMethodHelper(fx, fxPrime, x1)
    while (math.abs(xNext - x1) > toLearms){
      x1 = xNext
      println(xNext)
      xNext = newtonsMethodHelper(fx, fxPrime,x1)
    }
    xNext
  }

  /**
    * This is
    * @param fx
    * @param fxPrime
    * @param x
    * @return
    */
  def newtonsMethodHelper(fx: Double => Double,
                          fxPrime: Double => Double,
                          x: Double): Double = {
    x - fx(x)/fxPrime(x)
  }

}
