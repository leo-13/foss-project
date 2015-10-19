import geb.Page

/**
 * Created by Leonid on 10/19/2015.
 */
class SamplePage extends Page {
    static at = { homePageLogo.isDisplayed() }
    static url = "www.google.com"
    static content = {
        homePageLogo { $("img#hplogo") }
    }
}
