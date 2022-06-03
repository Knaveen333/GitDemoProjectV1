package com.scala.sample

object Test2 {

  def main(args: Array[String]): Unit = {

    val hungry = "yes"

    if (hungry == "yes" || hungry == "Y" || hungry == "y")
      println("eat something...")
    else
      println("Do work...")

  }

}
