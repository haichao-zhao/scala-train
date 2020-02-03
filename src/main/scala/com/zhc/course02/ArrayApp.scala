package com.zhc.course02

object ArrayApp extends App {
  println("test")

  var a = new Array[String](5)

  a(1) = "hello"
  a.length

  val b = Array("hadoop", "spark", "storm")

  val c = Array(1, 2, 34, 5, 6, 7, 7)
  c.sum
  c.min
  c.max

  val d = scala.collection.mutable.ArrayBuffer[Int]()

  d += 1
  d += 2
  d.append(2)
  d.appendAll(c)
  d.insert(1,4)
  d.remove(0)
  d.trimEnd(2)

  println(d)

}
