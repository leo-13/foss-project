import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

waiting {
    timeout = 15
    retryInterval = 0.5
}

cacheDriver = true
autoClearCookies = true
atCheckWaiting = true

reportOnTestFailureOnly = true

driver = {
    def chromeDriver = new File('src/test/resources/chromedriver.exe')
    System.setProperty('webdriver.chrome.driver', chromeDriver.absolutePath)
    ChromeOptions options = new ChromeOptions()
    options.addArguments("--start-maximized")
    options.addArguments("--test-type")
    new ChromeDriver(options)
}

baseUrl = "http://www.google.com"
if (!System.properties['geb.build.reportsDir'])
    reportsDir = "reports"