package problemsOneToTen

/**
  * Created by david on 01/03/17.
  */
object LargestPalindromeProduct {

  val largestPalindrome: Long = {
    val totalSeq: Seq[Long] = (100L to 999L).flatMap(i => (i to 999L).map(_ * i))
    totalSeq.filter(x => x.toString.reverse == x.toString).max
  }
}
