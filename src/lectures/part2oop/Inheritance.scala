package lectures.part2oop

object Inheritance extends App {

  //scala has single classs inheritance = you can extend only 1 class at the time
// access modifiers: private and protected
  class Animal {
    val creatureType = "wild"
    protected def eat = println("nomnomnom")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println(("crunch crunch"))
    }
  }
  //Cat = subclasss
  val cat = new Cat
  cat.crunch


  //extending class = inheriting all non private fields and methods




  // constructors
  class Person(name: String, age: Int){
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)


  //overriding
  class Dog extends Animal {
    override val creatureType: String = "domestic"
    override def eat = println("crunch crunch")

  }
  val dog = new Dog
  dog.eat
  println(dog.creatureType)
  //overriding works for methods, vals and vars


//type substitiution (broad polymorphism)
//  val unknownAnimal: Animal = new Dog("K9")
//  unknownAnimal.eat


    // overRIDING =(supplying different implementation in derived classes) vs overLOADING (supplying multiple methods with different signatures)

  // preventing overrides:
  // (1) add 'final' before defining class or member of the class (2), seal ("sealed") the class in this file only (which prevents extension in other classes)



}
