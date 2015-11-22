import geb.Page

/**
 * Created by Leo on 11/21/2015.
 */
class GoogleResultsPage extends Page {
    static at = { menuPanel.isDisplayed() }
    static content = {
        menuPanel { $("div#hdtbSum") }
        resultStats(required: false) { $("div#resultStats") }
        wrongElement { $("div.resultStats") }
    }

    def getResultsCount() {
        resultStats.text().replaceAll(",", "").find("\\d+").toInteger()
    }
}
