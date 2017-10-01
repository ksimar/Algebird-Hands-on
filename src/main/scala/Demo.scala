import com.twitter.algebird.Operators._

object Demo extends App {

  val data1 = Map(1->2, 2->1)
  val data2 = Map(1->3, 2->5, 3->7)
//  data1.+(data2)
  val res = data1 + data2
  println("res: " + res)
  println(Set(1,2,3)+Set(3,4,5,6))
}
