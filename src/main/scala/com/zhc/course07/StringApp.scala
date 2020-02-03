package com.zhc.course07

object StringApp extends App {

  val s = "hello: "

  //  println(s)

  val name = "pk"

  println(s"$s$name")

  val b =
    """
      |这是一个多行字符串
      |hello
      |world
      |...
    """.stripMargin

  println(b)
}
