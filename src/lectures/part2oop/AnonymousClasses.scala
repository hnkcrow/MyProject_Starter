package lectures.part2oop

object AnonymousClasses extends App {

  abstract class Animal {
    def eat: Unit
  }

  // anonymous class

//  class AnonymousClasses$$anon$1 extends Animal {
//
//  }



  val funnyAnimal: Animal = new Animal {
  override def eat: Unit = println("ahahaahh")
  }

  println(funnyAnimal.getClass)

  class Person(name: String) {
    def sayHi: Unit = println(s"Hi my name is $name, how can I help?")
  }

  val jim = new Person("Jim") {
    override  def sayHi: Unit = println(s"Hi my name is Jim, how can I help?")
  }


  /*
  * 1. create a generic trait MyPredicate-[T]  with method test[T] => Boolean
  * 2. Generic trait MyTransformer[-A,B] and include method to convert type A into type B;; with a method transform (A) => B
  * 3. MyList:
  *   - map(transformer) => MyList
  *   -filter(predicate) => MyList
  *   - flatMap(transformer) from A to MyList[B[) => myList[B]
  *
  *   class EvenPredicate extends MyPredicate[int]
  * class StrintToIntTransformer extends MyTransformer[String, Int]
  *
  *
  * [1,2,3].map(n * 2) = [2,4,6]
  * [1,2,3,4].filter(n % 2)) = [2,4]
  * [1,2,3].flatMap(n +> [n, n+1]) => [1,2,2,3,3,4] || tip:
  *
  * */



}
