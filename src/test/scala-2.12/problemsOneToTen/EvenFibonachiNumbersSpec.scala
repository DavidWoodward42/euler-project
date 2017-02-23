package problemsOneToTen

import org.scalatest.WordSpecLike

/**
  * Created by david on 22/02/17.
  */
class EvenFibonachiNumbersSpec extends WordSpecLike {

  "Calling sumOfEvenFibonachi" should {

    "when called with a value of 5 return 2" in {
      assert(EvenFibonachiNumbers.sumOfEvenFibonachi(5L) == 2L)
    }

    "when called with a value of 15 return 10" in {
      assert(EvenFibonachiNumbers.sumOfEvenFibonachi(15L) == 10L)
    }

  }

}
