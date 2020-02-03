package com.zhc.course07


object WordCount extends App {

  val s = "hello,hello,world,hello"

  val l = List(s)
  var m: Map[String, Int] = Map()
  var key = ""

  l.flatMap(_.split(",")).map((_, 1)).foreach(x => {
    key = x._1
    if (m.get(key) == None) {
      m += (key -> 1)
    } else {
      var v = m(key) + 1
      m += (key -> v)
    }
  })

//  println(m)


  println(l.flatMap(_.split(",")).map((_, 1)).groupBy(_._1).mapValues(_.size).toBuffer)

}
