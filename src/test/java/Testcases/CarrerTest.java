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
import Pages.CarrerPage;

public class CarrerTest extends BasePage {

	CarrerPage lp;
	private static Logger logger = LogManager.getLogger(CarrerTest.class);

	public CarrerTest() {
		super();

	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new CarrerPage(null);

	}

	@Test(priority = 14, groups = "sanity")
	public void CareerTesting() throws InterruptedException {

		LoginPage.cross_btn(driver).click();
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		Thread.sleep(2000);

		CarrerPage.career(driver).click();
		logger.info("searching carrer page");
		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(2000);

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Flipkart - Careers";
		Assert.assertEquals("Condition true", actualTitle, expectedTitle);
		System.out.println("Assertion Passed");

	}
}
