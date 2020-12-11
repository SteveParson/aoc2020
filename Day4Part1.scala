import scala.io.Source

object Day2 extends App {
  var keys = Array("byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid")
  var valid = 0
  
  var documents = Source.fromFile("day4input")
    .mkString
    .replaceAll("\\n\\n", ",")
    .replaceAll("\\n", " ")
    .split(",")

  for (document <- documents) {
    var isDocumentValid = true

    for (key <- keys) {
      if (!document.contains(key)) {
        isDocumentValid = false
      }
    }

    if (isDocumentValid) {
      valid += 1
    }
  }
  println(valid)
}