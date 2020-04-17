package com.scala.programs
object LeapYear {


  def main(args: Array[String]): Unit = {

    println("please enter year ")
    val year = scala.io.StdIn.readInt()
    println(leapYear(year))
  }

  def  leapYear(year:Int):String ={

    if(((year%4==0) && (year%100!=0)) || ((year%100==0) && (year%400==0)))
      return "given year is  leap year ";
    else
      return "given year is  not leap year ";
  }

}
//
//