package problemsOneToTen

/**
  * Created by david on 23/02/17.
  */
object PrimeFactors {

  def checkIfPrime(num: Long): Boolean = {
    if (num == 1L || num == 3L || num == 2L) true
    else {
      val seqOfChars: Seq[Long] = 2L to Math.round(Math.sqrt(num.toDouble).toLong)
      seqOfChars.map(x => num % x == 0).forall(!_)
    }
  }

  def primeSeq(num: Long): Seq[Long] = {
    lazy val stream: Stream[Long]  = (1L to Math.round(Math.sqrt(num.toDouble).toLong)).toStream
    stream.filter(x => checkIfPrime(x))
  }
}
