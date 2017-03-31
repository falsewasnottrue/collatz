
object Collatz {
  implicit class CollatzInt(value: Int) {
    def next: Option[Int] = None
  }
}
