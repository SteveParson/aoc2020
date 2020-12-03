import scala.io.Source

object Day1Part1 extends App {

  def getProductOfTwoNumbersThatSumTo(target:Int, numbers:Array[Int]) : Int = {
    for (i <- 0 to numbers.size - 1) {
      for (j <- i + 1 to numbers.size - 1) {
        if (numbers(i) + numbers(j) == target) {
          return numbers(i) * numbers(j)
        }
      }
    }
    -1;
  }

  val numbers = Source.fromFile("day1input")
    .getLines()
    .map(_.toInt)
    .toArray

  println(getProductOfTwoNumbersThatSumTo(2020, numbers))
}
