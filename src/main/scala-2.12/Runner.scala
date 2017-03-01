import problemsOneToTen.PrimeFactors

/**
  * Created by david on 23/02/17.
  */
object Runner extends App {
  val seq = PrimeFactors.lastPrimeFactor(600851475143L)
  print(seq)
}
