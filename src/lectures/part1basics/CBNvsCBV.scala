package lectures.part1basics

object CBNvsCBV extends App {
  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  //expression is evaluated every time from scratch when the function is called
  //diffrentiator " => " is called the binding call
  def calledByName(x: => Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())


  def infinite(): Int = 1 + infinite()

  def printFirst(x: Int, y: => Int) = println(x)

  //printFirst(infinite(), 34)
  printFirst(34, infinite())

  // CALL BY VALUE : the valye is computed before the fucntion is called, same value used everywhere
  //CALL BY NAME: expression is passed literally; expression is evaluated at every use within


}
