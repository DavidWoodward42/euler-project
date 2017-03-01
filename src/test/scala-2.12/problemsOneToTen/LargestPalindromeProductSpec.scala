package problemsOneToTen

import org.scalatest.WordSpecLike

/**
  * Created by david on 01/03/17.
  */
class LargestPalindromeProductSpec extends WordSpecLike {

  "Calling .largestPalindrome" should {

    "when called with 2 digit numbers" in {
      assert(LargestPalindromeProduct.largestPalindrome == 906609)
    }
  }
}
