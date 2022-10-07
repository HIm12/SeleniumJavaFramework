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
import Pages.becomeAsellerPage;

public class becomeAsellerTest extends BasePage {

	becomeAsellerPage lp;
	private static Logger logger = LogManager.getLogger(becomeAsellerTest.class);

	public becomeAsellerTest() {
		super();

	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new becomeAsellerPage(null);

	}

	@Test(priority = 12, groups = "sanity")
	public void becomesellerTesting() throws InterruptedException {

		LoginPage.cross_btn(driver).click();

		becomeAsellerPage.seller(driver).click();
		logger.info("click on become a seller page");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(2000);

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,-5000)");
		Thread.sleep(2000);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Sell Online on Flipkart | Grow your business with the leader in Indian e-commerce";
		Assert.assertEquals("Condition true", actualTitle, expectedTitle);
		System.out.println("Assertion Passed");

	}

}
