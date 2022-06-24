package lectures.part2oop

object MethodNotations extends App {

  class Person(val name: String, favouriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favouriteMovie
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name, What the heck?!"
    def unary_+ : Person = new Person(name, favouriteMovie, age + 1)
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favouriteMovie"
    def +(nickname: String) = new Person(s"$name ($nickname)", favouriteMovie)
    def apply(n:Int): String = s"$name watched $favouriteMovie $n times"
    def learns(thing: String) = s"$name is learning $thing"
    def learnsScala = this learns "Scala"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") //equivalent expression
  // infix notation = operator notation | only works with methods with one parameter (example of syntactic sugar)

  //"operators" in Scala
val tom = new Person("Tom", "Fight Club")
  println(mary hangOutWith tom)

  // ALL OPERATORS ARE METHODS
  println(1.+(2))

  // prefix notation -> unary operators (which are also METHODS
  val x = -1
  val y = 1.unary_- //these are the same
  //unary_ prefix only work with - + ~ !
  println(!mary)
  println(mary.unary_!)

  // postfix notation
  println(mary.isAlive)
  println(mary isAlive)

  // apply
  println(mary.apply())
  println(mary())

/*
1. Overload the + operator
  ex. mary + "the rockstar" => new person "Mary (the rockstar)"
 2. add an ageto the Peson class
 Add a unary + operator (inc the value of age)
 +mary => mary with the age incrementer

 ++

 3. Add a "learns" method in the Person class => Mary learns [ ]
    Add a learnsScala method, calls "learns" method with "Scala" as parameter
    Use it in postfix notation
  4. Overload the apply method

      mary.apply(2) => "Mary watched Inception 2 times"

 */

  //AD 1
  println((mary + "the Rockstar")())
  println((mary + "the Rockstar").apply())

  //AD 2
  println((+mary).age)

  //AD 3
  println(mary.learnsScala)

  //AD 4
  println(mary(10))
  println(mary.apply(10))

}
