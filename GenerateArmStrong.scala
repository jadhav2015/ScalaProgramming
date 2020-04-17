package com.scala.programs

object GenerateArmStrong {

  def main(args:Array[String]): Unit =
  {

    println("please enter number ")
    var number = scala.io.StdIn.readInt()

   for(i <- 1 to number by 1)
     {
       var num=i;
       var sum=0;
        while(num > 0)
          {
            var rem=num%10;
            sum=sum + rem*rem*rem;
            num=num/10;
          }

       if(i==sum)
         print(" "+sum+" ")
     }

  }
}
