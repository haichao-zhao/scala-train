package com.zhc.course09


import scala.xml.{Elem, XML}


object XMLApp {
  def main(args: Array[String]): Unit = {

    loadXML()
  }

  def loadXML(): Unit = {

    val xml = XML.load(this.getClass.getClassLoader.getResource("test.xml"))
    println(xml)
  }
}
