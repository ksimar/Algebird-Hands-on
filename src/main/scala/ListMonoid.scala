import algebra.Monoid

class ListMonoid[A] extends BaseMonoid[List[A]] {

  def op(a: List[A], b: List[A]): List[A] = a ++ b
  override def zero: List[A] = Nil

}

class StringMonoid extends BaseMonoid[String] {

  override def op(a: String, b: String): String = {
    println("a : " + a + " b : " + b )
    (a.trim + " " + b.trim).trim
  }
  override def zero: String = ""

}

trait BaseMonoid[A] {
  def op(a:A, b:A): A
  def zero:A
}

object MonoidDemo {

  def main(args: Array[String]): Unit = {
    val stringMonoid = new StringMonoid
    val words = List("Hello", "World")
    //folding a list with a monoid
    val s = words.foldRight(stringMonoid.zero)(stringMonoid.op)
    println("s : " + s)
  }

  //function folding a list with a monoid
  def concatenate[A](list: List[A], monoid: BaseMonoid[A]) = {
    list
  }

}


