import scala.io.Source

object Day2 extends App {

  val TupleRegex = """(\d+)-(\d+) (\w)\: (\w+)""".r
  def f(s: String) = s match {
    case TupleRegex(n1, n2, l, w) => (n1.toInt, n2.toInt, l, w)
  }

  println(
    Source.fromFile("day2input")
      .getLines()
      .map(x => f(x))
      .toArray
      .count(
        x => {
          val count: Int = x._4.sliding(x._3.length).count(_ == x._3)
          count >= x._1 && count <= x._2
        }
      )
  )
}