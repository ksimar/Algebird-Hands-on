import com.twitter.algebird.Operators._

object Demo extends App {

  val data1 = Map(1->2, 2->1)
  val data2 = Map(1->3, 2->5, 3->7)

  val res = data1 + data2
  println("res: " + res)

}
