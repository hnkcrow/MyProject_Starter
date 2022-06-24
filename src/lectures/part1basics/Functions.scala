package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b //string concatenation
  }

  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)

  }

  println(aRepeatedFunction("hello", 3))

  //in scala u use recursive functions instead of loops
  // WHEN you need loops use recursion

  def aFunctionWithSideEfects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

  /*
  1. A greeting function (name, age) => @"Hi my name is $name and I am $age years old"
2. Factorial function 1 *2 * 3*...* n [recursive function]
3. A fibonacci function f(1) = 1, f(2) 1; f(n) = f(n-1) + f(n-2)
4. Tests if a number is prime.
   */


  //1 FX
  def GreetingsFunction(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old."
  }: String

  println(GreetingsFunction("Toby", 12))

  //2 FX
  def FactorialFunction(n: Int): Int = {
    if (n == 0)
      return 1
    else
      return n * FactorialFunction(n - 1)
  }

  println(FactorialFunction(12))

  //3 Fibonacci function

  def Fibonacci(n: Int): Int = {
    //if (n==0) return 1
    if (n <= 2) return 1
    else
      return Fibonacci(n - 1) + Fibonacci(n - 2): Int

  }

  println(Fibonacci(8))

  // FX 4 prime number

  /*def PrimeFunction(i: Int): Boolean = {
    if (i <= 1) false
    else if (i == 2) true
    else !(2 to (i-1)).exists(x => i % x == 0)
  } */

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(3004))


}
