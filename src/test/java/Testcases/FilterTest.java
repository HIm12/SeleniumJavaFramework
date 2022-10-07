package Testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePage.BasePage;
import Pages.LoginPage;
import Pages.SearchItems;
import Pages.FilterOption;
import config.PropertiesFile;

public class FilterTest extends BasePage{
	
	FilterOption lp;
	private static Logger logger = LogManager.getLogger(FilterTest.class);

	public FilterTest() {
		super();
		
	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new FilterOption(null);

	}
	@Test(priority = 7, groups = "sanity")
	public void filterOption() throws InterruptedException {

		
		LoginPage.cross_btn(driver).click();


		SearchItems.search(driver).sendKeys(PropertiesFile.prop.getProperty("search1"));
		Thread.sleep(3000);

		SearchItems.search_btn(driver).click();
		Thread.sleep(3000);
		
		FilterOption.min_dropdown(driver);
		logger.info("minimum amount selected");
		Thread.sleep(3000);
		
		FilterOption.max_dropdown(driver);
		logger.info("maximum amount selected");
		Thread.sleep(5000);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Iphone 13- Buy Products Online at Best Price in India - All Categories | Flipkart.com";
		Assert.assertEquals("Condition true", actualTitle, expectedTitle);
	}
	
}