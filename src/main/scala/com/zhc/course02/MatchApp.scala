package com.zhc.course02

import scala.util.Random

object MatchApp extends App {
  val names = Array("Akiho Yoshizawa", "YuiHatano", "Aoi Sola")
  val name = names(Random.nextInt(names.length))

  name match {
    case "Akiho Yoshizawa" => println("吉老师...")
    case "YuiHatano" => println("波老师...")
    case _ => println("真不知道你们在说什么...")
  }

  def judgeGrade(grade: String): Unit = {
    grade match {
      case "a" => println("Excellent...")
      case "b" => println("Good...")
      case "c" => println("Just So So...")
      case _ => println("You need keep work...")
    }
  }

  //  judgeGrade("a")
  //  judgeGrade("c")
  //  judgeGrade("d")


  def judgeGrade1(name: String, grade: String): Unit = {
    grade match {
      case "a" => println("Excellent...")
      case "b" => println("Good...")
      case "c" => println("Just So So...")
      case _ => name match {
        case "lisi" => println("lisi you are good boy...")
        case _ => println("You need keep work...")
      }
    }
  }

  //  judgeGrade1("zhangsan", "d")
  //  judgeGrade1("lisi", "d")

  def greetingArray(array: Array[String]): Unit = {
    array match {
      case Array("zhangsan") => println("hi zhangsan")
      case Array(x, y) => println("hi " + x + " and " + y)
      case Array("zhangsan", _*) => println("hi zhangsan and other friends ...")
      case _ => println("hi everybody...")
    }
  }

  //  greetingArray(Array("zhangsan"))
  //  greetingArray(Array("lisi", "wangwu"))
  //  greetingArray(Array("zhangsan", "lisi", "wangwu"))
  //  greetingArray(Array("lisi", "zhangsan", "wangwu"))

  def greetingList(list: List[String]): Unit = {
    list match {
      case "zhangsan" :: Nil => println("hi zhangsan")
      case x :: y :: Nil => println("hi " + x + " and " + y)
      case "zhangsan" :: tail => println("hi zhangsan and other friends ...")
      case _ => println("hi everybody...")
    }
  }

  //  greetingList(List("zhangsan"))
  //  greetingList(List("lisi", "wangwu"))
  //  greetingList(List("zhangsan", "lisi", "wangwu"))
  //  greetingList(List("lisi", "zhangsan", "wangwu"))


  def matchType(obj: Any): Unit = {
    obj match {
      case i: Int => println("int")
      case s: String => println("string")
      case m: Map[_, _] => println("map")
      case _ => println("other type...")
    }
  }

  matchType(1)
  matchType("1")
  matchType(Map("name" -> "pk"))
  matchType(1f)

}
