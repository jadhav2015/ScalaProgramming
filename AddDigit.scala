package com.scala.programs

object AddDigit {

 def main(args:Array[String]): Unit =
  {

    println("please enter number ")
    var number = scala.io.StdIn.readInt()
    var sum=0;
    while(number > 0)
    {
      var reminder= number%10;
      sum=sum+reminder;
      number=number/10;
    }
    println("sum of number is : "+sum)

  }
}
