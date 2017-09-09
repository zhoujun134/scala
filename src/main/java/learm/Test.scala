package learm

/**
  * Created by zhoujun on 2017/9/5.
  */
class Test {

}

object Test{
  trait Person{
    def speak(msg: String)
  }
  trait Man{
    def manSpeak(msg: String)
  }
  abstract class AbsPerson extends Person{
    def log(msg: String) =  println
  }

  class P extends AbsPerson with Man{
    override def speak(msg: String): Unit = println("people speak:   " + msg)
    override def manSpeak(msg: String): Unit = println("man speak:    " + msg)
  }
  def main(args: Array[String]): Unit = {
    println("测试特质。。。")
    val p  = new P()
    p.speak("张珊  ")
    p.manSpeak("你好！")
    val f = new Function0[String]{
      override def apply(): String = "Test function!"
    }
    val f2 = () -> "Test function2 "
    println(f.apply())
    println( "  f2._1:   " + f2._1 +"  f2._2: " + f2._2 + "   apply: " + f2.getClass)

  }
}