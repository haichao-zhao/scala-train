package com.zhc.course09


import java.io.{FileInputStream, InputStreamReader}

import scala.xml.{Elem, XML}


object XMLApp {
  def main(args: Array[String]): Unit = {

    //    loadXML()
    readXMLAttr()
  }

  def readXMLAttr(): Unit = {
    val xml = XML.load(this.getClass.getClassLoader.getResource("pk.xml"))

    val HeaderField = xml \ "header" \ "field"

    val allField = xml \\ "field"
    //    allField.foreach(println)

    // header/field/name
    //    val names = (xml \ "header" \ "field").map(_ \ "@name")
    //    println(names)


    //    val names = xml \ "header" \ "field" \\ "@name"
    //    names.foreach(println)

    (xml \ "header" \ "field").map(
      x => (x \ "@name", x.text, x \ "@required")
    ).foreach(println)

  }

  def loadXML(): Unit = {

    //    val xml = XML.load(this.getClass.getClassLoader.getResource("test.xml"))

    // val xml = XML.load(new FileInputStream("/Users/zhaohaichao/workspace/javaspace/scala-train/src/main/resources/test.xml"))

    val xml = XML.load(new InputStreamReader(new FileInputStream("/Users/zhaohaichao/workspace/javaspace/scala-train/src/main/resources/test.xml")))

    println(xml)
  }
}
