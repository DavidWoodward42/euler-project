package problemsOneToTen

import org.scalatest.WordSpecLike

/**
  * Created by david on 01/03/17.
  */
class SmallestMultipleSpec extends WordSpecLike {

  "Calling .smallestMultiple" should {

    "when called with 10 return 2520" in {
      assert(SmallestMultiple.smallestMultiple(10) == 2520)
    }

    "when called with 7 return 60" in {
      assert(SmallestMultiple.smallestMultiple(7) == 60)
    }

    "when called with 6 return 60" in {
      assert(SmallestMultiple.smallestMultiple(6) == 60)
    }

    "when called with 20 return 2520" in {
      assert(SmallestMultiple.smallestMultiple(20) == 2520)
    }
  }
}
