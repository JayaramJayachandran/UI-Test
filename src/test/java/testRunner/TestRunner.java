package testRunner;

import java.util.Map;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/resources/featureFiles" },
		glue = { "webdriver", "steps", "testRunner" },
		tags = { "~@ignore"},
		plugin = {"pretty"})
public class TestRunner {
	
	public static Map<String, String> config;
	public static Scenario scenario;
}
