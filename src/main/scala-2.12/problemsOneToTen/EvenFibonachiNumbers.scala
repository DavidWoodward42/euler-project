package problemsOneToTen

/**
  * Created by david on 22/02/17.
  */
object EvenFibonachiNumbers {

  def sumOfEvenFibonachi(limit: Long): Long = {
    lazy val seq: Stream[Long] = 0L #:: seq.scanLeft(1L)(_ + _)
    seq.takeWhile(_ <= limit).filter(_ % 2 == 0).sum
  }
}
