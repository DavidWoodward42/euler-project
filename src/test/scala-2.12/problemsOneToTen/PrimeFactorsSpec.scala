package problemsOneToTen

import org.scalatest.WordSpecLike

/**
  * Created by david on 23/02/17.
  */
class PrimeFactorsSpec extends WordSpecLike {

  "Calling .checkIfPrime" should {

    "when called with a value of 3" in {
      assert(PrimeFactors.checkIfPrime(3L))
    }

    "when called with a value of 4" in {
      assert(!PrimeFactors.checkIfPrime(4L))
    }

    "when called with a value of 5" in {
      assert(PrimeFactors.checkIfPrime(5L))
    }

    "when called with a value of 8" in {
      assert(!PrimeFactors.checkIfPrime(8L))
    }

    "when called with a value of 9" in {
      assert(!PrimeFactors.checkIfPrime(9L))
    }

    "when called with a value of 10" in {
      assert(!PrimeFactors.checkIfPrime(10L))
    }

    "when called with a value of 11" in {
      assert(PrimeFactors.checkIfPrime(11L))
    }

    "when called with a value of 13" in {
      assert(PrimeFactors.checkIfPrime(13L))
    }
  }

  "Calling .primeSeq" should {

    "when called with a value of 2" in {
      assert(PrimeFactors.primeSeq(2L) == Seq(1L))
    }

    "when called with a value of 3" in {
      assert(PrimeFactors.primeSeq(3L) == Seq(1L))
    }

    "when called with a value of 4" in {
      assert(PrimeFactors.primeSeq(4L) == Seq(1L, 2L))
    }

    "when called with a value of 16" in {
      assert(PrimeFactors.primeSeq(16L) == Seq(1L, 2L, 3L))
    }

    "when called with a value of 144" in {
      assert(PrimeFactors.primeSeq(144L) == Seq(1L, 2L, 3L, 5L, 7L, 11L))
    }
  }

//  "Calling .primeFactors with a value of 13195" should {
//
//    "return a sequence of 5, 7, 13, 29" in {
//      assert(PrimeFactors.primeFactors(13195L) == Seq(5, 7, 13, 29))
//    }
//  }
}
