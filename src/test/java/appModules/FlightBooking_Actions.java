package appModules;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.LandingPage;
import pages.SearchResultPage;
import webdriver.Driver;

public class FlightBooking_Actions {
	static long waitTimeOut = 5000L;
	static WebDriver driver = Driver.getCurrentDriver();
	static WebDriverWait wait = new WebDriverWait(driver, 60);
	static LandingPage lp = new LandingPage(driver);
	static SearchResultPage sp = new SearchResultPage(driver);

	public static void getonLandingPage() {
		String appUrl = "https://www.emirates.com/ae/english/";
		driver.get(appUrl);
		wait.until(ExpectedConditions.elementToBeClickable(LandingPage.departCityElement()));

	}

	public static void searchFlightTickets(String strSource, String strDestination, String startDate, String endDate) {
		LandingPage.departCityElement().clear();
		LandingPage.departCityElement().sendKeys(strSource);
		wait.until(ExpectedConditions.visibilityOf(LandingPage.olDepartListElement()));
		LandingPage.olDepartListElement().click();
		LandingPage.arrivalCityElement().clear();
		wait.until(ExpectedConditions.visibilityOf(LandingPage.olArrivalDDLElement()));
		LandingPage.arrivalCityElement().sendKeys(strDestination);
		wait.until(ExpectedConditions.visibilityOf(LandingPage.olArrivalListElement()));
		LandingPage.olArrivalListElement();
		LandingPage.continueBtnElement().click();
		wait.until(ExpectedConditions.elementToBeClickable(LandingPage.deparDatePickerDDLElement()));
		LandingPage.deparDatePickerDDLElement().click();
		waitForPageToLoad(waitTimeOut);
		wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.xpath(String.format(lp.datePickerString(), dateReformat(startDate))))));
		driver.findElement(By.xpath(String.format(lp.datePickerString(), dateReformat(startDate)))).click();
		waitForPageToLoad(waitTimeOut);
		LandingPage.returnDatePickerDDLElement().click();
		waitForPageToLoad(waitTimeOut);
		wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.xpath(String.format(lp.datePickerString(), dateReformat(endDate))))));
		driver.findElement(By.xpath(String.format(lp.datePickerString(), dateReformat(endDate)))).click();
		wait.until(ExpectedConditions.elementToBeClickable(LandingPage.serchFlightBtnElement()));
	pwaitForPageToLoad(waitTimeOut);
		LandingPage.serchFlightBtnElement().click();
	}

	public static void getLowestPrice() {
		wait.until(ExpectedConditions.titleContains(sp.getPageTitle()));
		String lowestPrice = sp.lowestPriceElement().getText();
		assertTrue(true);
	}
	public static void waitForPageToLoad(long ts) {
		try {
			Thread.sleep(ts);
		} catch (Exception e) {

		}
	}

	public static String dateReformat(String strDate) {
		String[] dateArr = strDate.split("-");
		return dateArr[0] + "  " + dateArr[1] + " " + dateArr[2];
	}
}
