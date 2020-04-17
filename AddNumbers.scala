package com.scala.programs

object AddNumbers {

 def main(args:Array[String]): Unit =
  {
    println("please enter number ")
    var number = scala.io.StdIn.readInt()
    var sum=1;
    for(i <- 1 to number)
      {
        sum=sum+i;
      }
    println("adding numbers we get "+sum)
  }
}
