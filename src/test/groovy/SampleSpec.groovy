import geb.spock.GebReportingSpec

/**
 * Created by Leonid on 10/19/2015.
 */
class SampleSpec extends GebReportingSpec {

    def setup() {
        to GoogleHomePage
    }

    def "PassingTest"() {
        expect: "Home Page is Displayed"
        at GoogleHomePage
    }

    def "FailingTest_expect_block"() {
        expect:
        !homePageLogo.isDisplayed()
    }
}
