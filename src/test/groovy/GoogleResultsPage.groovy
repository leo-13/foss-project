import geb.Page

/**
 * Created by Leo on 11/21/2015.
 */
class GoogleResultsPage extends Page {
    static at = { menuPanel.isDisplayed() }
    static content = {
        menuPanel { $("div#hdtbSum") }
    }
}
