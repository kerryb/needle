import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers

class NeedleFinderSpec extends Spec with ShouldMatchers {
  describe("Finding a needle") {
    describe("in an empty haystack") {
      val finder = new NeedleFinder("")

      it("returns an empty result") {
        finder.find should equal("")
      }
    }

    describe("when there is an exact match") {
      val finder = new NeedleFinder("3\nfoo\nfoo")

      it("finds a match at 0") {
        finder.find should equal("0")
      }
    }
  }
}
