package com.scala.programs

object Palindrome {

  def main(args:Array[String]): Unit = {

    println("please enter number ")
    var number = scala.io.StdIn.readInt()
    var reverse=number;
    var sum=0;
    while(number > 0)
    {
      var reminder= number%10;
      sum=sum*10+reminder
      number=number/10;
    }
    if(reverse==number)
    println("reverse of the given number "+sum+"palindrome")
    else
    println("reverse of the given number "+sum+" is not palindrome")
  }
}
