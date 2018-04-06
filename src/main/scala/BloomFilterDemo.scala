import com.twitter.algebird.BloomFilterMonoid


object BloomFilterDemo extends App{

  val list = (1 to 5000).toList

  val NUM_HASHES = 6
  val width = 6000
  val SEED = 1

  implicit val bloomFilter = new BloomFilterMonoid[String](NUM_HASHES,width)

  val A_bf = list.map{i => bloomFilter.create(i.toString)}
  val B_bf = A_bf.map(bf => bf.contains("150") ).drop(140)
  val C_bf = A_bf.map(bf => bf.contains("2"))

  println("approxBool1 : ")
  println(B_bf)
  println("approxBool2 : ")
  println(C_bf)

}
