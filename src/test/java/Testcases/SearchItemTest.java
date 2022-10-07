package Testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePage.BasePage;
import Pages.LoginPage;
import Pages.SearchItems;
import config.PropertiesFile;

public class SearchItemTest extends BasePage {

	SearchItems lp;
	private static Logger logger = LogManager.getLogger(SearchItemTest.class);

	public SearchItemTest() {
		super();

	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new SearchItems(null);

	}

	@Test(priority = 6, groups = "sanity")
	public void searchitem() throws InterruptedException {

		LoginPage.cross_btn(driver).click();

		SearchItems.search(driver).sendKeys(PropertiesFile.prop.getProperty("search"));
		Thread.sleep(3000);

		SearchItems.search_btn(driver).click();
		logger.info("search item");
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(2000);

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,-5000)");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-10000)");
		Thread.sleep(2000);

		String actualTitle = driver.getTitle();
		String expectedTitle = "Samsung Mobiles- Buy Products Online at Best Price in India - All Categories | Flipkart.com";
		Assert.assertEquals("Condition true", actualTitle, expectedTitle);
		System.out.println("Assertion Passed");
	}


}
