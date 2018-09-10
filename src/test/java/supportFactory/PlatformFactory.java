package supportFactory;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;

import enums.Platform;
import testRunner.TestRunner;

public class PlatformFactory {
	static Platform platform = Platform.valueOf(TestRunner.config.get("platform"));
	static String desiredPlatformVersion = TestRunner.config.get("platformVersion");

	public static DesiredCapabilities selectPlatform(DesiredCapabilities caps) {
		switch (platform) {
		case Windows:
			caps.setCapability("os", "Windows");
			caps.setPlatform(org.openqa.selenium.Platform.WINDOWS);
			break;
		default:
			throw new WebDriverException("No platform specified");
		}
		return caps;
	}
}
