package lectures.part2oop

object Objects extends App {


//SCALA DOES NOT HAVE CLASS-LEVEL FUNCTINALITY ("static")
  object  Person {
  //"static"/"class" - level functionality
  val N_EYES = 2
  def canFly: Boolean = false

  //factory method
  def apply(mother: Person, father: Person): Person = new Person("Bobbie")

  }

  class Person (val name: String){
    //instance-lvel functionality
  }
  //COMPANIONS ^


  println(Person.N_EYES)
  println(Person.canFly)

//SCALA OBJECT = SINGLETON INSTANCE
  // when I define obbject Person I define its type  + its only instance
  val mary = new Person("Mary") //example of instance of the Person type
  val john = new Person("John")
  println(mary == john) //that is true because both values go to the same instance

val person1 = Person
  val person2 = Person
  println(person1 == person2)

  val bobbie = Person.apply(mary, john)
  println(bobbie)

  //SCALA APPLICATIONS = Scala object with
  // def main(args: Array[String]): Unit

// scala doesnt have statuc values/methods but it has scala objects (have its own type and they are the only instance) major adv: singleton pattern in one line
  //scala companions (objects and classes can stay in the same scope)


}
