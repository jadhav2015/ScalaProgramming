package com.scala.programs

object Factorial {

  def main(args:Array[String]): Unit =
  {
    println("please enter number ")
    var number = scala.io.StdIn.readInt()
    var fact=1;


    def factFunction(number:Int):Int=
    {
      for(a <- 1 to number)
      {
        if (fact == 0)
          return 0;
        else
          fact = fact * a;
      }
      return fact;
    }

    println("factorial  of the number "+factFunction(number)+"!")
  }
}
