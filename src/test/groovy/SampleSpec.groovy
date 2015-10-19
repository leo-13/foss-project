import geb.spock.GebReportingSpec

/**
 * Created by Leonid on 10/19/2015.
 */
class SampleSpec extends GebReportingSpec {

    def setup() {
        to SamplePage
    }

    def "PassingTest"() {
        expect: "Home Page is Displayed"
        at SamplePage
    }

    def "FailingTest"() {
        expect:
        !homePageLogo.isDisplayed()
    }
}
