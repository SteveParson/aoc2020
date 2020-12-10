import scala.io.Source

object Day3Part2 extends App {
  var paths = Array((1,1), (3,1), (5,1), (7,1), (1,2))
  var tree_product : Long = 1
  var map = Source.fromFile("day3input")
    .getLines().toArray

  for (path <- paths) {
    var trees, col, row = 0
    while (row < map.length) {
      if (map(row)(col) == '#') trees += 1
      col = (col + path._1) % map(row).length
      row = row + path._2
    }
    tree_product *= trees
  }
  print(tree_product)
}