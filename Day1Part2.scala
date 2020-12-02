object Day1Part2 extends App {

  def getProductOfThreeNumbersThatSumTo(target:Int, numbers:Array[Int]) : Int = {
    for (i <- 0 to numbers.size - 1) {
      for (j <- 1 to numbers.size - 1) {
        for (k <- 2 to numbers.size -1) {
          if (numbers(i) + numbers(j) + numbers(k) == target) {
            return numbers(i) * numbers(j) * numbers(k)
          }
        }
      }
    }
    -1;
  }

  val numbers = Source.fromFile("day1input")
    .getLines()
    .map(_.toInt)
    .toArray

  println(getProductOfThreeNumbersThatSumTo(2020, numbers))
}
