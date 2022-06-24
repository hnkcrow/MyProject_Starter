package lectures.part2oop

object CaseClasess extends App {

  //problem: equals, hashCode, toString...

  case class Person(name: String, age: Int)

  //1. class parameters are fileds
  val jim = new Person("Jim", 34)
  println(jim.name)

  //2. sensible toString
  //prinln(instance = println(instatnce.toString) // syntactic sugar


  println(jim.toString)

  //3. equals and hashCode
  val jim2 = new Person("Jim", 34)
  println(jim == jim2)

  //4. case classes have handy copy method

  val jim3 = jim.copy(age = 45) //copy creates new instance of that class
  println(jim3)

  //5. case classes have companion object
//  val thePerson == CaseClasess.Person
  val mary = Person("Mary", 23)

  //6. case classes are serializable
  //useful in AKka

  //7. case classes have extractor patterns => CCS can be used in PATTERN MATCHING

  case object UnitedKingdom {
    def name: String = "The UK of GB and NI"
  }

  /*EXCERCISE
  expand MyList = use case classes and case objects

  *

companion already implemented
we can clone
!serialization available!

  * */



}
