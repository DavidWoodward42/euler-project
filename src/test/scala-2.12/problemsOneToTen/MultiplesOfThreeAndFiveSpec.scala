package problemsOneToTen

import org.scalatest._

/**
  * Created by david on 13/02/17.
  */
class MultiplesOfThreeAndFiveSpec extends WordSpecLike {

  "Calling .sumOfMultiples with a value of 10" should {

    "return a value of 23" in {
      assert(MultiplesOfThreeAndFive.sumOfMultiples(10L) == "23")
    }
  }
  "Calling .sumOfMultiples with a value of 1000" should {

    "return a value of 233168" in {
      assert(MultiplesOfThreeAndFive.sumOfMultiples(1000L) == "233168")
    }
  }
}
