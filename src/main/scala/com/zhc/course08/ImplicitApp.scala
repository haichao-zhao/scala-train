package com.zhc.course08

object ImplicitApp extends App {

  //定义隐式转换函数即可
  implicit def man2superman(man: Man): SuperMan = new SuperMan(man.name)

  val man = new Man("pk")
  man.fly()


}

class Man(val name:String){
  def eat(): Unit ={
    println(s"man [$name] eat ...")
  }
}

class SuperMan(val name:String){
  def fly(): Unit ={
    println(s"superman [$name] fly ...")
  }
}