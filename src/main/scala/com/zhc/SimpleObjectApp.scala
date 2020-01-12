package com.zhc

object SimpleObjectApp {

  def main(args: Array[String]): Unit = {
    val p = new Perple
    p.name = "hahah"

    println(p.name, p.age)
    println(p.eat)
    println(p.getGender())
  }
}

class Perple {
  var name: String = _
  val age = 10

  def eat(): String = {
    name + " eat...."
  }

  private[this] val gender: String = "1"

  def getGender(): String = {
    gender
  }

}
