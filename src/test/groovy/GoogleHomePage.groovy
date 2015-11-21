import geb.Page

/**
 * Created by Leonid on 10/19/2015.
 */
class GoogleHomePage extends Page {
    static at = { homePageLogo.isDisplayed() }
    static content = {
        homePageLogo { $($("div#hplogo"), $("img#hplogo")) }
        searchInput { $("input#lst-ib") }
        searchButton { $("input", name: "btnK") }
    }
}
