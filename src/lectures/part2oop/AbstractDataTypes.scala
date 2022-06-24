package lectures.part2oop

object AbstractDataTypes extends App {

  //abstract = classes which contains unimplemented classes
  //u dont suppy values

  //abstract classes cannot be instatiated
  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"

    override def eat: Unit = println("crunch crunch")
  }
//traits ; can be inherited along classes
  trait Carnivore {
  def eat(animal: Animal): Unit  //this method is also abstract
  val preferredMeal: String = "fresh meat"
}
  trait ColdBlooded
  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "croc"
    def eat: Unit ="nomnomnom"
    def eat(animal: Animal): Unit = println( s"I'm a croc and I'm eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)
//traits vs abstract classes
  //abstract classes can have (non)abstract classes


  // KEY TAKEAWAYS
  //1 traits cannot have constructor parameters
  //2 multiple traits may be inherited by the same class
  //3 traits are chosen to describe type of behaviour, abstract class ="thing"




}
