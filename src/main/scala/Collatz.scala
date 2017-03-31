
object Collatz {
  implicit class CollatzInt(value: Int) {
    def next: Option[Int] = value match {
      case 1 => None
      case i if i%2 == 0 => Some(i/2)
      case i => Some(3*i + 1)
    }
  }
}
