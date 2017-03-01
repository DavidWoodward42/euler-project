package problemsOneToTen

/**
  * Created by david on 01/03/17.
  */
object SmallestMultiple {

  def smallestMultiple(limit: Long): Int = {

    lazy val stream: Stream[Long] = 2L #:: stream.scanLeft(limit)((x, _) => x + 1)
    val range = 1L until limit

    //Returns true if the number does not divide completely by one or more of the numbers in the range
    def divideByRange(num: Long): Boolean = {
      !range.forall(num % _ == 0)
    }

    stream.dropWhile(x => divideByRange(x)).head.toInt
  }
}
