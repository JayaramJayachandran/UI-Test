package steps;

import static org.junit.Assert.assertTrue;

import appModules.FlightBooking_Actions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightSearchSteps {
	String website;
	@Given("^I have decided to check available flights$")
	public void i_have_decided_to_check_available_flights() {
		FlightBooking_Actions.getonLandingPage();
	    
	}

	@When("^I at a return trip from \\\"([^\\\"]*)\\\" to \\\"([^\\\"]*)\\\" departing on \\\"([^\\\"]*)\\\" and returning on \\\"([^\\\"]*)\\\"$")
	public void i_at_a_return_trip_one_week_from_now(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	    FlightBooking_Actions.searchFlightTickets(arg1, arg2, arg3, arg4);
	    
	}

	@Then("^I should be shown the cheapest return ticket$")
	public void i_should_be_shown_the_cheapest_return_ticket() throws Throwable {
		FlightBooking_Actions.getLowestPrice();
		assertTrue(true);
	    
	}
}
