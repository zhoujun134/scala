package scalaTest.test2

class I_mapTest[T <: Any] {

}
object I_mapTest{

  def main(args: Array[String]): Unit = {
    val pairA = new Pair(4, 5)
    println(pairA.first)
  }
}
class Variance[+A] {
  def compile[B >: A](elem: B): Seq[Any] = List[B](elem)
}
class Pair[T](val first: T, val second: T)(implicit ev$1: T => Comparable[T])