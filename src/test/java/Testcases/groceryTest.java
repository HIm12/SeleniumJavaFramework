package Testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePage.BasePage;
import Pages.LoginPage;
import Pages.groceryPage;

public class groceryTest extends BasePage {

	groceryPage lp;
	private static Logger logger = LogManager.getLogger(groceryTest.class);

	public groceryTest() {
		super();

	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new groceryPage(null);

	}

	@Test(priority = 13, groups = "sanity")
	public void groceryiconTesting() throws InterruptedException {

		LoginPage.cross_btn(driver).click();
		driver.navigate().refresh();
		groceryPage.grocery(driver).click();
		logger.info("grocery link searched");
		Thread.sleep(1000);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Flipkart Grocery Store - Buy Groceries Online & Get Rs.1 Deals at Flipkart.com";
		Assert.assertEquals("Condition true", actualTitle, expectedTitle);
		System.out.println("Assertion Passed");
	}

}
