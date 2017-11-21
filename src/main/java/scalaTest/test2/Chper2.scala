package scalaTest.test2

object Chper2 {

  def main(args: Array[String]): Unit = {
//     println(signum(12))
//     println(signum(-12))
//    println(signum(0))
//    test4()

//    countdown(5)

    test6("Hello")
  }

  /**
    * 2.1 一个数字如果为正数，则它的signum为1；如果是负数,则signum为-1；如果为0,则signum为0；编写一个函数来计算这个值
    * print(signum(12))
    * print(signum(-12)
    * print(signum(0))
    */
  def signum(num: Int): Int = if (num > 0) 1 else 0

  /**
    * 2.2 一个空的快表达式{}的值是什么，类型是什么
    * 在 REPL 中测试 val t={}
    */

  /**
    * 2.3 在Scala中何种情况下赋值语句x=y=1是合法的。(提示：给x找个合适的类型定义)
    * 由于在scala中的赋值语句是Unit类型，所以只要x为Unit类型就可以了。测试如下：
    *
    *
    * scala> var x=()
      x: Unit = ()

      scala> var y = 8
      y: Int = 8

      scala> x=y=0
      x: Unit = ()
    */

  /**
    * 2.4 针对下列Java循环编写一个Scala版本：
    *  for(int i=10;i>=0;i–) System.out.println(i);
    */
  def test4(): Unit ={
    for(i <- -0 to 10 reverse) print(i + "\t")
  }

  /**
    * 2.5 编写一个过程countdown(n:Int)，打印从n到0的数字
    */
  def countdown(n:Int): Unit ={
    for( i <- -0 to n reverse) print(i + "\t")
  }

  /**
    * 2.6 编写一个for循环,
    *     计算字符串中所有字母的Unicode代码的乘积。
    *     举例来说，"Hello"中所有字符串的乘积为9415087488L
    */
  def test6(str: String): Unit ={
    var t: Long = 1
    for(ch <- str){
      t = t * ch
    }
    print(t)
  }

  /**
    * 2.7 同样是解决前一个练习的问题，但这次不使用循环。（提示：在Scaladoc中查看StringOps）
    */
}
