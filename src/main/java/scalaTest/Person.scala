package scalaTest

/**
  * Created by zhoujun on 2017/9/3.
  */
class Person(var firstName: String, var lastNmae: String){
  println("the Construct begins")

  private val HOME = System.getProperty("user.name")
  var age = 0

  override def toString: String = s"$firstName  $lastNmae is $age years old"
  def printHome{println(s" HOME = $HOME")}

  // using the toString
  def printFullNmae{ println(this)}

  printHome
  printFullNmae
  println("still in the construct...")
}

object Person{
  def main(args: Array[String]): Unit = {
    val p = new Person("zhou","jun")
    p.firstName = "zhang shang"
    println(p.firstName)

  }
}