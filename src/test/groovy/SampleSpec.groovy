import geb.spock.GebReportingSpec
import org.openqa.selenium.Keys

/**
 * Created by Leonid on 10/19/2015.
 */
class SampleSpec extends GebReportingSpec {

    def validSearchString = "Chicago"

    def setup() {
        to GoogleHomePage
    }

    def searchForText(text) {
        searchInput.value(text)
        searchInput << Keys.ENTER
        at GoogleResultsPage
    }

    def "PassingTest1"() {
        expect:
        at GoogleHomePage
    }

    def "PassingTest2"() {
        when: "I search for a valid search string"
        searchForText(validSearchString)

        then:
        getResultsCount() > 100000
    }

    def "FailingTest_expect_block"() {
        expect:
        !homePageLogo.isDisplayed()
    }

    def "FailingTest_then_block"() {
        when: "I search for a valid search string"
        searchForText(validSearchString)

        then:
        getResultsCount() < 100
    }

    def "FailingTest_when_block"() {
        when: "I search for a valid search string"
        searchInput.value(validSearchString)
        at GoogleResultsPage

        then:
        getResultsCount() > 100
    }

    def "FailingTest_setup_block"() {
        setup:
        to GoogleResultsPage

        when: "I search for a valid search string"
        searchForText(validSearchString)

        then:
        getResultsCount() > 100
    }

    def "FailingTest_cleanup_block"() {
        when: "I search for a valid search string"
        searchForText(validSearchString)

        then:
        getResultsCount() > 100000

        cleanup:
        wrongElement.click()
    }
}
