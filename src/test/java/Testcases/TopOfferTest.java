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
import Pages.TopOfferPage;

public class TopOfferTest extends BasePage {

	TopOfferPage lp;
	private static Logger logger = LogManager.getLogger(TopOfferTest.class);

	public TopOfferTest() {
		super();

	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new TopOfferPage(null);

	}

	@Test(priority = 20, groups = "sanity")
	public void topoffertesting() throws InterruptedException {

		LoginPage.cross_btn(driver).click();
		Thread.sleep(2000);

		TopOfferPage.top_offer(driver).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(2000);

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		js.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(3000);
		logger.info("Top Offer Testing");
		driver.navigate().refresh();
		String actualTitle = driver.getTitle();
		String expectedTitle = "Flipkart Offers & Deals of the Day - Get Best Discounts on Mobiles, Electronics, Fashion & Home etc.";
		Assert.assertEquals("Condition true", actualTitle, expectedTitle);
		System.out.println("Assertion Passed");

	}

}
