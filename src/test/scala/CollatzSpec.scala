import org.scalatest.{FlatSpec, Matchers}
import Collatz._

class CollatzSpec extends FlatSpec with Matchers {

  it should "have 1 as bottom element" in {
    1.next should be(None)
  }

  it should "handle even numbers" in {
    2.next should be(Some(1))
    256.next should be(Some(128))
  }

  it should "handle odd numbers" in {
    3.next should be(Some(10))
    17.next should be(Some(52))
  }
}
