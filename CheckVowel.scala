package com.scala.programs

object CheckVowel {

  def main(args: Array[String]): Unit = {
    println("please enter character  ")
    val charInput = scala.io.StdIn.readChar()
    println("given chararacter is " + checkVowel(10,charInput.toUpper))
  }


  def checkVowel(a:Int,x: Char): String = x match {
    case 'A' => "vowel";
    case 'E' => "vowel";
    case 'I' => "vowel";
    case 'O' => "vowel";
    case 'U' => "vowel";
    case _ => "consonent";
  }
}
