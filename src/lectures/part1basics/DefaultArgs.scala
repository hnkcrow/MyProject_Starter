package lectures.part1basics

object DefaultArgs extends App {


  //passing default values for parameters
  def tfFact(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else tfFact(n - 1, n * acc)

  val fact10 = tfFact(10, 2)

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("saving picture...")

  savePicture("bmp")
  /*
!you cannot name-by-default LEADING args in function!
1. pass in every leading argument
2. name the arguments (e.g. width = 900)
3. order in which you pass on the args in the function dont matter as long as you name them
 */

  savePicture(height = 600, width = 800, format = "bmp")
}
