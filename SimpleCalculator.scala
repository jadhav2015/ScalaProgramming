package com.scala.programs

object SimpleCalculator {

  def main(args: Array[String]): Unit = {

    println("please enter number in console ")

    var number1 = scala.io.StdIn.readInt()
    var number2 = scala.io.StdIn.readInt()
    var operation = scala.io.StdIn.readLine();

    println("user input number is " + number1 + " " + number2)
    println("given " + operation + " " + calculatorFunc(number1, number2, operation))
  }

  def calculatorFunc(a: Int, b: Int, x: String): Int = x match {
    case "add" => a + b
    case "sub" => a - b
    case "mul" => a * b
    case "div" => a / b
    case _ => 0
  }
}
