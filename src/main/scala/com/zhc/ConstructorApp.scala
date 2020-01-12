package com.zhc

object ConstructorApp {
  def main(args: Array[String]): Unit = {
    val p = new Perple1("zhangsan", "apple")
    println(p.eat())

    val student: Student = new Student("zhangsan", "apple", "xuexi")
  }
}

class Perple1(val name: String, val food: String) {
  var job: String = _

  //  var name: String = name
  val age = 10

  def eat(): String = {
    name + " eat...." + food
  }

  private[this] val gender: String = "1"

  def getGender(): String = {
    gender
  }

  def this(name: String, food: String, job: String) {
    this(name, food)
    this.job = job
  }

}

class Student(name: String, food: String, var major: String) extends Perple1(name, food) {


}