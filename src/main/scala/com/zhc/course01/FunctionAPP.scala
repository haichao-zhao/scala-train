package com.zhc.course01

object FunctionAPP {

  def main(args: Array[String]): Unit = {
    //    println(add(1, 2))
    //    println(three) // 不需要入参的话，括号可以不写
    //    four
    //    sayhello()


    println(sum(1, 2, 3, 4))

    //    for (i <- 10.until(1, -1)) {
    //      println(i)
    //    }

    var l = Array(1, 2, 3, 4, 5, 6)
    l.foreach(x => println(x))
  }

  def add(x: Int, y: Int) = {
    x + y // 最后一行就是返回值，不需要return
  }

  def three() = 1 + 1

  def four(): Unit = {
    println("I am Four")
  }

  def sayhello(name: String = "zhc"): Unit = {
    println("my name is " + name)
  }

  //可变参数
  def sum(nums: Int*) = {
    var result = 0
    for (num <- nums) {
      result += num
    }
    result
  }
}
