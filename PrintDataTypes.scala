package com.scala.programs

object PrintDataTypes
{
  // data types in scala are generic not strictly typed
  def main(args:Array[String])={

    val valNum:Int=10;      // declaring constant data type
    var varNum:Int=10;     // declaring variable data type
    varNum=20;             // for var we can change value

    println(valNum);
    println(varNum);
 }
}
