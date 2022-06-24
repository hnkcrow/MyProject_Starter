package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 //EXPRESSIONS
  println(x)

  println(2 + 3 * 4) //example of math expression
  // + - * / & | ^ << >> >>>(right shift with zero extension)

  print(1 == x)
  // == != > >= < =<

  println(!(1 == x))
  // ! && (and) || (or)

  var aVariable = 2
  aVariable += 3 //also works with -= *= /= ......... side effects
  println(aVariable)

  //instructions vs Expressions
  // instruction = sth u tell the pc to DO
  //expresssion = sth that has a value and/or a type

  // IF expression
  val aCondition = true
  val aConditionValue = if (aCondition) 5 else 3 //IF EXPRESSION
  println(aConditionValue)

  //EVERYTHING IN SCALA IS AN EXPRESSION

  val aWeirdValue = (aVariable = 3) // Unit === void (dont return anything meaningful)
  println(aWeirdValue) //will print ()


  // side effects: println, whiles, reassigning

  // Code blocks: 1) are expressions 2) the vallue of the block = value of its last expression; same goes for its data type

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"

  }

  // 1. difference betweren @hello world" vs printlin("hello world")
  // 2.

  val someValue = {
    2 < 3
  }

  val someOtherValue = {
    if (someValue) 239 else 986
    42
  }


}
