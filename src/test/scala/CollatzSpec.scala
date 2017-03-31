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

  it should "build chains" in {
    1.chain should be(Seq(1))
    5.chain should be(Seq(5,16,8,4,2,1))
    7.chain should be(Seq(7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1))
    7.chain should be(Seq(7,22,11,34,17,52,26,13,40,20,10) ++ 5.chain)
  }
}
