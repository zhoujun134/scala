package learm1

class Test {

}

object Test{
//   val MOD_ADLER = 65521
//  def main(args: Array[String]): Unit = {
//    val sum = adler32Sum("Wikipedia")
//    printf("checkSum (Int) = %d\n", sum)
//    printf("checkSum (Int) = %s\n", sum.toHexString)
//  }
//
//  def adler32Sum(s: String): Int = {
//    var a = 1
//    var b = 0
//    s.getBytes.foreach{char =>
//      a = (char + a) % MOD_ADLER
//      b = (b + a) %MOD_ADLER
//    }
//    // note: Int is 32 bits, which this requires
//    b * 65536 + a
//  }

//  import java.io._
//  def main(args: Array[String]): Unit = {
//    var in = None: Option[FileInputStream]
//    var out = None: Option[FileOutputStream]
//
//    try{
//      in = Some(new FileInputStream("E:\\test.txt"))
//      out = Some(new FileOutputStream("E:\\test1.txt"))
//      var c = 0
//      while ({c = in.get.read; c != 1}){
//        println(c)
//        out.get.write(c)
//      }
//    }catch {
//      case e: Exception => e.printStackTrace()
//    }finally {
//      println("entered finally ...")
//      if (in.isDefined) in.get.close
//      if (out.isDefined) out.get.close
//    }
//  }

//  case class Person(firstName: String, lastNmae: String)
//  def main(args: Array[String]): Unit = {
//    val i = 5
//    i match {
//      case 1 | 3 | 5 | 7 | 9  => println("odd  " + i)
//      case 2 | 4 | 6 | 8 | 10 => println("even  " + i)
//    }
//
//  }
//  def matchType(x: Any): String = x match {
////    case x: List(1,_*) => s"$x"
//    case x @ List(1,_*) => s"$x"
////    case Some(_) => "got a Some"
////    case Some(x) => s"$x"
//    case x @ Some(_) => s"$x"
//    case p @ Person(firstName, "Doe") => s"$p"
//  }

  def main(args: Array[String]): Unit = {
//    val Inner = new Breaks
//    val Outer = new Breaks
//    Outer.breakable{
//      for(i <- 1 to 5){
//        Inner.breakable{
//          for(j <- 'a' to 'e'){
//            if(i == 1 && j == 'c') Inner.break else println(s"i: $i, j: $j")
//            if(i == 2 && j == 'b') Outer.break
//          }
//        }
//      }
//    }
//    for{
//      i <- 1 to 3
//      j <- 1 to 5
//      k <- 1 to 10
//    }{
//      println(s"i:  $i,  j:  $j,  k:  $k")
//    }

//    for (i <- scala.util.Random.nextInt(10)) yield i

    test12( x => {
      println("函数内： " + x*x)
      x*x
    }, 12)

  }

  def test12(f: Int => Int, x: Int): Unit ={
    f.apply(x)
  }

}
