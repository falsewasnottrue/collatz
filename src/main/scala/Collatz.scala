
object Collatz {
  implicit class CollatzInt(value: Int) {
    val next: Option[Int] = value match {
      case 1 => None
      case i if i%2 == 0 => Some(i/2)
      case i => Some(3*i + 1)
    }

    def chain: Seq[Int] = next match {
      case None => Seq(value)
      case Some(n) => value +: n.chain
    }
  }
}
