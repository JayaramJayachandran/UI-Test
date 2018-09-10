package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import webdriver.Driver;

public class SearchResultPage {
	static WebDriver driver=Driver.getCurrentDriver();
	@FindBy(how=How.XPATH,using="//span[@class='summary-curr-only']")
	private static WebElement lowestPrice;
	private String pageTitle ="Search results | Make a booking | Emirates"; 
	public SearchResultPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement lowestPriceElement() {
		return lowestPrice;
	}
	public String getPageTitle() {
		return pageTitle;
	}
}
