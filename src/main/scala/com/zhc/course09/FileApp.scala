package com.zhc.course09

import scala.io.Source

object FileApp {

  def main(args: Array[String]): Unit = {
    val file = Source.fromFile("/Users/zhaohaichao/data/emp.txt")

    def readLine(): Unit = {
      for (line <- file.getLines()) {
        println(line)
      }
    }

    def readChar(): Unit ={
      for (ele <- file) {
        println(ele)
      }
    }

    def readNet(): Unit ={
      val file = Source.fromURL("http://www.baidu.com")
      for (line <- file.getLines()) {
        println(line)
      }
    }

    readNet()

  }
}
