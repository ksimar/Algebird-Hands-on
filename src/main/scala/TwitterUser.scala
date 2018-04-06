import algebra.Monoid
import com.twitter.algebird.Max

case class TwitterUser(val name: String, val numFollowers: Int) extends Ordered[TwitterUser] {
  def compare(that: TwitterUser): Int = {
    val c = this.numFollowers - that.numFollowers
    if (c == 0) this.name.compareTo(that.name) else c
  }
}

object TwitterUserDemo extends App {

  val zero = TwitterUser("MinUser", Int.MinValue)

  implicit def twitterUserMonoid: Monoid[Max[TwitterUser]] = Max.monoid(zero)

  val barackobama = TwitterUser("BarackObama", 40267391)
  val narendramodi = TwitterUser("narendramodi", 48013573)
  val kejriwal = TwitterUser("kejriwal", 40756470)
  val simar = TwitterUser("simar", 73)
  val taylorswift = TwitterUser("taylorswift13", 37125055)


  val winner: Max[TwitterUser] = Max(barackobama) + Max(narendramodi) + Max(kejriwal) + Max(simar) + Max(taylorswift)

  println("Winner: " + winner)

}