package com.zhc.course09

import java.sql.{Connection, DriverManager}

object MySQLApp {
  def main(args: Array[String]): Unit = {
    //    val driver = "com.mysql.jdbc.Driver"
    val url = "jdbc:mysql://localhost:3306/mysql"
    val username = "root"
    val password = "root"

    var conn: Connection = null

    try {

      // make the connection
      classOf[com.mysql.jdbc.Driver]

      conn = DriverManager.getConnection(url, username, password)
      val stmt = conn.createStatement()
      val resultSet = stmt.executeQuery("select host , user from user")

      while (resultSet.next()) {
        val host = resultSet.getString("host")
        val user = resultSet.getString("user")
        println(s"$host  ---  $user")
      }
    } catch {
      case e: Exception => e.getStackTrace
    }
    finally {
      if (conn != null) {
        conn.close()
      }

    }


  }

}
