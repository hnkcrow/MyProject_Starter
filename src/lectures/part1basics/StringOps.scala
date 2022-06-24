package lectures.part1basics

object StringOps extends App {

  val str: String = "Hello, I am learning Scala"
  //strings are zero-indexed (0, 1, 2, 3...)
  //spaces are not counted

  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length)


  val aNumberString = "2"
  val aNumber = aNumberString.toInt //conversin String to Int
  println('a' +: aNumberString :+ 'z') //prepending
  println(str.reverse)
  println(str.take(2))


  //Scala-specifinc: String interpolators

  //S-interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old"
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1}  years old"
  println(anotherGreeting)

  //F-interpolators

  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute"
  println(myth)
  //f interpolators can check for type correctness!

  // raw-interpolation | works similarly as s | ignores escaped characters

  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")
}