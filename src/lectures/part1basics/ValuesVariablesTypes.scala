package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x: Int = 42
  println(x)


  //VALS ARE IMMUTABLE
  // compiler can infer types

  val aString: String = "hello"
  val anotherString: String = "goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4612 //2 bytes only not 4
  val aLong: Long = 3095823095L //int represented by double short ; put L at the end to represent it as Long
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14 //ints with decimals

  // variables
  var aVariable: Int = 4

  aVariable = 5 // side effects = changing variable
  // functional programming = working more with vals not vars

}
