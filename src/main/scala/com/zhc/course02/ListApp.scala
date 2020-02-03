package com.zhc.course02

object ListApp extends App {

  val l = List(1, 2, 3, 4, 5)

  l.sum

  val l0 = scala.collection.mutable.ListBuffer[Int]()

  l0 += 5
  l0 ++= l

  println(l0)

}
