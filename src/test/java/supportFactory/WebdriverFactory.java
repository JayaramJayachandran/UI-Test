package supportFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import testRunner.TestRunner;
import webdriver.Driver;

public class WebdriverFactory {
	private static class BrowserCleanup implements Runnable {
		public void run() {
			System.out.println("Cleaning up the browser");
			try { 
				Driver.webdriver.quit();
			} catch (NullPointerException e) {
				System.out.println("Browser already shut down.");
			}
		}
	}
	public static WebDriver createWebdriver() {
		caps = new DesiredCapabilities();
		String seleniumEnvironment = TestRunner.config.get("seleniumEnvironment");
		
		if (seleniumEnvironment.equals("local")) {
			Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
			return BrowserFactory.selectLocalBrowser();
		} 
		return null;
	}

	public static DesiredCapabilities caps;
	public static DesiredCapabilities additionalCapabilities = new DesiredCapabilities();

}
