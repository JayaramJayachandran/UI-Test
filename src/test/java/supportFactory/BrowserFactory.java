package supportFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import enums.Browser;
import testRunner.TestRunner;

public class BrowserFactory {
	static Browser browser = Browser.valueOf(TestRunner.config.get("browser"));
	static String desiredBrowserVersion = TestRunner.config.get("browserVersion");

	public static DesiredCapabilities selectBrowser(DesiredCapabilities caps) {
		switch (browser) {
		case Chrome:
			caps.setCapability("browserName", "chrome");
			break;
		default:
			throw new WebDriverException("No browser specified");
		}
		caps.setCapability("version", desiredBrowserVersion);
		return caps;
	}
	
	public static WebDriver selectLocalBrowser() {
		switch (browser) {
		case Chrome:
			return new ChromeDriver();
		default:
			throw new WebDriverException("No browser specified");
		}
	}
}
