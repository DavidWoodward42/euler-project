package problemsOneToTen

/**
  * Created by david on 13/02/17.
  */
object MultiplesOfThreeAndFive {

  def sumOfMultiples(limit: Long): String = {
    (1L until limit).toStream.filter(x => x % 3 == 0 || x % 5 == 0).foldLeft(0L)(_ + _).toString
  }
}
