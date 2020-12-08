import scala.io.Source

object Day2Part2 extends App {

  val TupleRegex = """(\d+)-(\d+) (\w)\: (\w+)""".r

  println(
    Source.fromFile("day2input")
      .getLines()
      .map(x => x match { case TupleRegex(n1, n2, l, w) => (n1.toInt, n2.toInt, l, w) })
      .toArray
      .count(x => { (x._4(x._1 - 1) == x._3(0) && x._4(x._2 - 1) != x._3(0)) ||
                    (x._4(x._1 - 1) != x._3(0) && x._4(x._2 - 1) == x._3(0))     }  )
  )
}