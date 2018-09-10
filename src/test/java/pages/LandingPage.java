package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import webdriver.Driver;

public class LandingPage {
	static WebDriver driver = Driver.getCurrentDriver();
	@FindBy(how = How.XPATH, using = "//div[@class='search-flight  js-search-flight']//input[@name = 'Departure airport']")
	private static WebElement DepartCity;
	@FindBy(how=How.XPATH, using = "//ol[@class='location__list']/li[@data-dropdown-id = 'DXB']")
	private static WebElement olDepartList;
	@FindBy(how = How.XPATH, using = "//div[@class='search-flight  js-search-flight']//input[@name = 'Arrival airport']")
	private static WebElement ArrivalCity;
	@FindBy(how = How.XPATH, using = "//div[@data-subsection='flight']/div[@class = 'destination-dropdown']//section[@class='location global']/ol[@class='location__list']")
	private static WebElement olArrivalDDL;
	@FindBy(how=How.XPATH, using = "//ol[@class='location__list']/li[@data-dropdown-id = 'LHR']")
	private static WebElement olArrivalList;
	@FindBy(how = How.XPATH, using = "//a[@class='cta cta--large cta--primary js-continue-search-flight search-flight__continue--cta ']")
	private static WebElement ContinueBtn;
	@FindBy(how =How.XPATH, using = "//label[@for='search-flight-date-picker--depart']")
	private static WebElement departDatePickerDDL;
	@FindBy(how =How.XPATH, using = "//label[@for='search-flight-date-picker--return']")
	private static WebElement returnDatePickerDDL;
	@FindBy(how=How.XPATH, using = "//button[@class = 'cta cta--large cta--primary js-widget-submit ']")
	private static WebElement searchFlightBtn;
	
	public String datePicker = "//eol-calendar[@title = 'Please choose your departure date']//a[@aria-label = '%s']";
	//eol-calendar[@title = 'Please choose your departure date']//a[@data-string = '2162018']

	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public static WebElement departCityElement() {
		return DepartCity;
	}
	public static WebElement arrivalCityElement() {
		return ArrivalCity;
	}
	public static WebElement continueBtnElement() {
		return ContinueBtn;
	}
	public String datePickerString() {
		return datePicker;
	}
	public static WebElement deparDatePickerDDLElement(){
		return departDatePickerDDL;
	}
	public static WebElement returnDatePickerDDLElement(){
		return returnDatePickerDDL;
	}
	public static WebElement serchFlightBtnElement(){
		return searchFlightBtn;
	}
	public static WebElement olArrivalListElement(){
		return olArrivalList;
	}
	public static WebElement olDepartListElement(){
		return olDepartList;
	}

	public static WebElement olArrivalDDLElement(){
		return olArrivalDDL;
	}
}
