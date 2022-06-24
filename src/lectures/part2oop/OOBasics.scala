package lectures.part2oop

object OOBasics extends App {

  val person = new Person("John", 26)
  println(person.x)
//  person.greet("Daniel")
//  person.greet()

  val author = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))

  val counter = new Counter
//  counter.inc.print

}
  //constructor = every single instance of person must be constructed of name and age
    class Person(val name: String, val age: Int = 0) {
  //body
    val x = 2

    println((1+3))

    //method
    def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

    //overloading = defining methods with different signatures (different number of parameters)
//    def greet(): Unit = println(s"Hi, I am $name")
//    def greet(): Int = 42

    //multiple constructors
    def this(name: String) = this(name, 0)  //we call primary constructor
    def this() = this("John Doe")
}// class parameters are NOT FIELDS

/*
Novel and a Writer class
Writer: first name, surname, YoB,
method fullname = concat first name + surname

Novel: name, year of release, author
-method: authorAge,
method2: isWrittenBy (author)
method3: copy (new year of release) = new instance of Novel with the new year of release
 */

class Writer(firstName: String, surname: String, val year: Int) {
  def fullName: String = firstName + " " + surname
}

class Novel(name: String, year: Int, author: Writer) {
  def authorAge = year - author.year
  def isWrittenBy(author: Writer) = author  == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}



/*
counter class
-receives an int value
- method current count
- method to increment/decrement the counter by 1 => new Countr
-overload inc/dec to receive an amount
 */

class Counter(val count: Int = 0) {
  def inc = {
    println("incrementing...")
    new Counter(count + 1) //immuatability (we create new counter)
  }

  def dec ={
    println("decrementint...")
    new Counter(count - 1)
  }

  def inc(n: Int):Counter = {
    if (n<=0) this
    else  inc.inc(n-1)
  }
  def dec(n: Int): Counter =  {
    if (n<=0) this
    else  inc.inc(n-1)

//    def print= println(count)
  }
}


