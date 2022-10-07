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
import Pages.ContactUsPage;

public class contactUsTest extends BasePage {

	ContactUsPage lp;
	private static Logger logger = LogManager.getLogger(contactUsTest.class);

	public contactUsTest() {
		super();

	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new ContactUsPage(null);

	}

	@Test(priority = 16, groups = "sanity")
	public void contactusclick() throws InterruptedException {

		LoginPage.cross_btn(driver).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(2000);

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		Thread.sleep(2000);

		ContactUsPage.contact(driver).click();
		logger.info("contact us page");

	}

	@Test(priority = 17, groups = "sanity")
	public void helpcentericon() throws InterruptedException {
		LoginPage.cross_btn(driver).click();

		Thread.sleep(2000);

		ContactUsPage.contact(driver).click();

		ContactUsPage.help_center(driver).click();
		logger.info("Help Center Page");

		String actualTitle = driver.getTitle();
		String expectedTitle = "Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com";
		Assert.assertEquals("Condition true", actualTitle, expectedTitle);
		System.out.println("Assertion Passed");
	}

}
