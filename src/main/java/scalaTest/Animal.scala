package scalaTest

/**
  * Created by zhoujun on 2017/9/3.
  */
class Animal(private[this] var _name: String, private[this] var _age: Int){

  def name = _name

  def name_ (name: String) { _name = name }

  def age = _age

  def  age_(age: Int){ _age = age }
}

object Animal{
  def main(args: Array[String]): Unit = {
    val a = new Animal("pander", 12)
    println(s"name: ${a.name}, age: ${a.age}")
  }
}
