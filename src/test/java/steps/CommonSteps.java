package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import webdriver.Driver;

public class CommonSteps {
	@When("^Take_a_screenshot_named \"([^\"]*)\"$")
	public void Take_a_screenshot_named(String filename) throws Throwable {
		Driver.takeScreenshot(filename);
	}

	@Then("^Embed a screenshot in the report$")
	public void Embed_a_screenshot_in_the_report() throws Throwable {
		Driver.embedScreenshot();
	}
}
