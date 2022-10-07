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
import Pages.TravelIconPage;

public class TravelIconTest extends BasePage {

	TravelIconPage lp;
	private static Logger logger = LogManager.getLogger(TravelIconTest.class);

	public TravelIconTest() {
		super();

	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new TravelIconPage(null);

	}

	@Test(priority = 15, groups = "sanity")
	public void TraveliconTesting() throws InterruptedException {

		LoginPage.cross_btn(driver).click();
		
		TravelIconPage.travel(driver).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(2000);

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,-5000)");
		Thread.sleep(2000);
		logger.info("TraveliconTesting");
		driver.navigate().refresh();
	}

}
