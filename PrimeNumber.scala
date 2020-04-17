package com.scala.programs

object PrimeNumber {

  def main(args:Array[String]): Unit =
  {

    println("please enter number ")
    var number = scala.io.StdIn.readInt()
    println("is given number is prime "+isPrime(number))

    def isPrime(i: Int): Boolean = {
      if (i <= 1)
        false
      else if (i == 2)
        true
      else
        !(2 until i).exists(n => i % n == 0)
    }

  }
}
