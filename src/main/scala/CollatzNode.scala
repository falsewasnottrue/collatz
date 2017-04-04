sealed trait CollatzNode {
  def value: Int
  def next: Option[CollatzNode]
}

case class Node(value: Int) extends CollatzNode {
  lazy val next = Some(Node(value))
}

object Node {
  def apply(value: Int) = value match {
    case 1 => One
    case v => new Node(v)
  }
}

case object One extends CollatzNode {
  val value = 1
  val next = None
}