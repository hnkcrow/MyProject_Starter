package lectures.part3fp

object WhatsAFunction  extends App {


  // use functions as first class elements
  // problem: everything is an object

  val doubler = new MyFunction[Int, Int] {
     def apply(element: Int): Int = element * 2

  }

  println(doubler(2))

  // function types = Function1[A, B] - by default supported by Scala
  val stringToIntConverter = new Function1[String, Int] {
    override def apply(string: String): Int = string.toInt
  }

  println(stringToIntConverter("3") + 4)

  val adder: ((Int, Int) => Int) = new Function2[Int, Int, Int] {
    override def apply(a: Int, b: Int): Int = a + b
  }
  // ALl scala functions are objects or instances of classes derived from classes

/*

1. a function which takes 2 strings and concatenates them
2. transform the MyPredicate  and MyTransformer into function types
3. define a function  which takes an arg (int) and returns another function which takes an Int and returns an Int
  -  define what's the type of this function
  - how do you do it?

 */

//  AD 1
  def concatenator: (String, String) => String = new Function2[String, String, String] {
    override def apply(a: String, b: String): String = a + b
  }
  println(concatenator("hello ", "Scala"))


  //AD 2
  //Function1[Int, Function1[Int, Int]]
  val superAdder: Function1[Int, Function1[Int, Int]] = new Function1[Int, Function1[Int, Int]] {
  override def apply(x: Int): Function1[Int, Int] = new Function1[Int, Int] {
    override def apply(y: Int): Int = x + y
  }
  }
  val adder3 = superAdder(3)
  println(adder3(4))
  println(superAdder(3)(4)) //curried function ; they can be called with multiple parameter lists

}



trait MyFunction[A, B] {
  def apply(element: A): B
}