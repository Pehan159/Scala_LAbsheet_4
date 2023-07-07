import scala.io.StdIn

object Labsheet {
  def main(args: Array[String]): Unit = {
    println("Enter deposit amount:")
    var depAmount = StdIn.readInt()

    var result = calAmount(depAmount)
    result = result * depAmount

    println("Total amount is-:"+(depAmount+result))
  }

  def calAmount(dep: Int): Double = {
    var rate = 0.0

    if (dep <= 2000) {
      rate = 0.02
    } else if (dep <= 20000) {
      rate = 0.04
    } else if (dep <= 200000) {
      rate = 0.035
    } else {
      rate = 0.065
    }

    rate
  }
}
