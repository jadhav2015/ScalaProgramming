package com.scala.programs

object ReverseNumber {


  def main(args:Array[String]): Unit = {

    println("please enter number ")
    var number = scala.io.StdIn.readInt()

    var sum=0;
    while(number > 0)
    {
      var reminder= number%10;
      sum=sum*10+reminder
      number=number/10;
    }
    println("reverse of the given number is "+sum)
  }
}
