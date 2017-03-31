import org.scalatest.{FlatSpec, Matchers}
import Collatz._

class CollatzSpec extends FlatSpec with Matchers {

  it should "have 1 as bottom element" in {
    1.next should be(None)
  }

}
