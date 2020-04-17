package com.scala.programs

object primeNumber {

  def main(args:Array[String]): Unit =
  {


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
