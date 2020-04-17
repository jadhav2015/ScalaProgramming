package com.scala.programs

object ArmStrongNumber {

  def main(args:Array[String]): Unit =
  {

    println("please enter number ")
    var number = scala.io.StdIn.readInt()
    var temp=number;
    var sum=0;
    while(number > 0)
      {
        var reminder= number%10;
        sum=sum+reminder*reminder*reminder
        number=number/10
      }
    if(temp==sum)
    println("given number is armstrong number")
    else
      println("given number is not armstrong number")
  }
}
