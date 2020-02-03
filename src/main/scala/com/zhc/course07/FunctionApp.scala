package com.zhc.course07

object FunctionApp extends App {

  def sayHello(name: String): Unit = {

    println(s"hello: $name")

  }

  sayHello("pk")


  val l = List(1, 2, 3, 4, 5, 6, 7, 8)

  println(l.map(x => x + 1))
  println(l.map(_ * 2))
  l.map(_ * 2).filter(_ > 8).foreach(println)

  println(l.reduce(_ + _))

}
