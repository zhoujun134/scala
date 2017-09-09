package scalaTest

/**
  * Created by zhoujun on 2017/9/3.
  */
class Pizza(var crustSize: Int, var crustType: String) {

  def this(crustSize: Int){ this(crustSize, Pizza.DEFAULT_CRUSTTYPE)}

  def this(crustType: String) { this(Pizza.DEFAULT_CRUSTSIZE,crustType)}

  def this(){ this(Pizza.DEFAULT_CRUSTSIZE, Pizza.DEFAULT_CRUSTTYPE)}

  override def toString: String = s"crustSize: $crustSize, crustType:  $crustType"
}

object Pizza{
  val DEFAULT_CRUSTSIZE: Int = 12
  val DEFAULT_CRUSTTYPE: String = "THIN"


  def main(args: Array[String]): Unit = {
    val p = Pizza
    val p1 = new Pizza(1, "p1")
    val p2 = new Pizza(12)
    val p3 = new Pizza("p3")

    println(p)
    println(p1)
    println(p2)
    println(p3)

  }
}
