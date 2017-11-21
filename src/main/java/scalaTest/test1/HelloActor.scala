//package akkaLearm
//
//import java.lang.Exception
//import java.util.Scanner
//
//import akka.actor.{Actor, ActorSystem, Props}
//
///**
//  * Created by zhoujun on 2017/9/19.
//  */
//class HelloActor extends Actor{
//  override def receive: Receive = {
//    case "hello" => println("hello back at you")
//    case x => println("hub? " + x)
//    case _ => println("else")
//  }
//}
//
//object Main extends App{
//  val system = ActorSystem("helloActor")
//  val helloActor = system.actorOf(Props[HelloActor], name = "helloActor")
//  helloActor ! "hello"
//  helloActor ! "benos dias"
//  val scanner = new Scanner(System.in)
//  var istrue = true
//  while(istrue){
//    println("请输入要发送的消息： ")
//    val s = scanner.nextLine()
//    helloActor ! s
////    if(Integer.parseInt(s) == 0) istrue =false
//  }
//  println("退出。。。")
//}
//
//
