import scala.io.Source

object Day3Part1 extends App {
  var trees = 0;
  var column = 0;

  def f(pattern: String): Unit = {
    if (pattern(column) == '#') { trees += 1 }
    column = (column+3) % pattern.length
  }

  Source.fromFile("day3input")
    .getLines().toArray
    .foreach(x => f(x))

  print(trees)
}