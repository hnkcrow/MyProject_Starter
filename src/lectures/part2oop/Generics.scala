package lectures.part2oop

object Generics extends App {
  class MyList[+A] {
    //use the type A inside the class definition
    // A - type of parameter
    def add[B >: A]  (element: B): MyList[B] = ???
    /* A = CAt
    B = Animal
    */

  }

  //more than 1 generic type is possible..
  class MyMap[Key, Value]

  val listOfIntigers = new MyList[Int]
  val listOfStrings = new MyList[String]

  //generic methods
  object  MyList {
    def empty[A]: MyList[A] = ???

  }
  val emptyListOfIntegers = MyList.empty[Int]

  //variance problem
    class Animal
    class Cat extends Animal
    class Dog extends Animal

  //1. yes List[Cat] extends List[Animal] = COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  //can I add any animal to it? || we return a list of ANIMALS


  //2. NO list of cats and list of animals are 2 separate things; every type is in its world

  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  //3. Hell, no! CONTRAVARIANCE
  class Trainer[-A]
  val Trainer: Trainer[Cat] = new Trainer[Animal]

  //bounded types
  class Cage[A <: Animal] (animal: A) //class cage only accepts only parameter A which is subtype of Animal class (SUBTYPE BOUNDED TYPE)
  val cage = new Cage(new Dog)

//  class Car
//  val newCage = newCage(new Car)

//  expand MyList to be generic


}
