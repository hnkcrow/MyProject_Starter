package lectures.part2oop

import java.nio.BufferUnderflowException

object Exceptions extends App {

  //when your program crashes

  val x: String = null
//  println(x.length)
//this ^^ will crash with a No pointer Exception
  //throwing and catchin exceptions


  //1. how to throw exception
  //val aWeirdValue: String = throw new NullPointerException
  //throwable classes extends the Throwable class
  //Exception and Error are the major Throwable subtypes

  //Error = sth wrong with JVM/system

  //2. how to catch exceptions
  def getInt(withExceptions: Boolean): Int =
    if (withExceptions) throw new RuntimeException("No int for you!")
    else 42

  val potentialFail = try{ //code that may throw an exception
    getInt(false)
  } catch{
//    case e: NullPointerException => println("caught a Runtime exception")
    case e: RuntimeException => 43

  } finally {
    //code that will get executed NO MATTER WHAT
//this block is optional
    println("finally")
  }
println(potentialFail)

  //3. how to define your own exceptions (instances of special classes)
  class MyException extends Exception{
    val exception = new MyException

    throw exception
  }


  /*
  1. Crash your program with an OutOfMemoryError
  2. Crash with StackOverflowError
  3. PocketCalculater
  - add(x,y)
  - multiply(x,y)
  -divide (x,y)
  -substract(x,y)

  Throw a custom exception if sth happens
  -OverflowException if add(x,y) exceeds Int.MAX_VALUE
  -UnderfloeException if substract(x,y) exceeds Int.MIN_VALUE
  - MathCalculationException for division by 0

   */
//AD 1|  OOM
//val  array = Array.ofDim(Int.MaxValue)

  //SO
//
//  def infinite: Int = 1 + infinite
//  val noLimit = infinite

  class OverflowException extends RuntimeException
  class UnderflowException extends RuntimeException
  class MathCalculationException extends RuntimeException("Division by 0")

  object  PocketCalculator{
    def add(x: Int, y: Int) = {

      val result = x + y
      if (x > 0 && y > 0 && result < 0) throw new OverflowException
      else if (x <0 && y <0 && result > 0) throw new UnderflowException
      else result
    }

    def subtract(x: Int, y: Int): Int = {
      val result = x - y
      if (x > 0 && y <0 && result < 0) throw new OverflowException
      else if (x<0 && y>0 && result >0 ) throw new UnderflowException
      else result
    }

    def multiply(x: Int, y: Int): Int = {
      val result = x * y
      if (x > 0 && y > 0 && result < 0) throw new OverflowException
      else if  (x < 0 && y < 0 && result < 0) throw new OverflowException
      else if  (x > 0 && y < 0 && result < 0) throw new UnderflowException
      else if  (x < 0 && y > 0 && result > 0) throw new UnderflowException
      else result
    }

    def divide(x: Int, y: Int): Int ={
      if (y==0)  throw new MathCalculationException
      else x / y
    }


  }



//  println(PocketCalculator.add(Int.MaxValue, 10))

  println(PocketCalculator.divide(2, 2))


}
