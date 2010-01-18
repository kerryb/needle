import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers

class NeedleFinderSpec extends Spec with ShouldMatchers {
  describe("Finding a needle") {
    describe("in an empty haystack") {
      val finder = new NeedleFinder

      it("Returns an empty result") {
        finder.find should equal("")
      }
    }
  }
}
