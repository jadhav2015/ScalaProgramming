package com.scala.programs

object OddEven {

  def main(args: Array[String]): Unit = {

    println("please enter number in console ")
    var number = scala.io.StdIn.readInt()
    println("user input number is " + number)

    if (number % 2 == 0) {
      println("given number is even number")
    }
    else {
      println("given number is odd number" + number)
    }
  }

}
