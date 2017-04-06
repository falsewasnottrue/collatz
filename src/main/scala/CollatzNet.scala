
class CollatzNet {

  private val nodes: List[CollatzNode] = Nil

  // FIXME implement
  private def getIfExists(value: Int): Option[CollatzNode] = ???

  // FIXME implement
  // TODO apply method?
  private def newCollatzNet(ns: List[CollatzNode]): CollatzNet = ???

  def get(value: Int): (CollatzNet, CollatzNode) = getIfExists(value) match {
    case Some(node) => (this, node)
    case None => ???
  }
}
