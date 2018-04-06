import com.twitter.algebird.Aggregator

object AggregatorDemo extends App {

  val alice = io.Source.fromFile("/home/simar/Documents/exercism_data/scala/AlgebirdDemo1/src/main/resources/alice.txt").getLines().toStream
  val alicewords = alice.flatMap(_.toLowerCase.split("\\s+"))
  val aCount = Aggregator.count { s: String => s == "alice" }

  val res = aCount(alicewords)
  println("res: " + res)

}
