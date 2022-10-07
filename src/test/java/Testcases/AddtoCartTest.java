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
import Pages.AddtoCart;
import config.PropertiesFile;

public class AddtoCartTest extends BasePage {
	AddtoCart lp;

	private static Logger logger = LogManager.getLogger(AddtoCartTest.class);

	public AddtoCartTest() {
		super();

	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new AddtoCart(null);

	}

	@Test(priority = 8, groups = "smoke")
	public void selectItem() throws InterruptedException {

		LoginPage.login_btn_click(driver);

		LoginPage.username(driver).sendKeys(PropertiesFile.prop.getProperty("username"));

		Thread.sleep(2000);

		LoginPage.password(driver).sendKeys(PropertiesFile.prop.getProperty("password"));
		Thread.sleep(2000);

		LoginPage.submit(driver).click();
		Thread.sleep(2000);

		SearchItems.search(driver).sendKeys(PropertiesFile.prop.getProperty("search"));
		Thread.sleep(3000);
		logger.info("Item searched");

		SearchItems.search_btn(driver).click();
		Thread.sleep(3000);

		AddtoCart.select_product(driver).click();
		logger.info("Item added in cart");

		String actualTitle = driver.getTitle();
		String expectedTitle = "Samsung Mobiles- Buy Products Online at Best Price in India - All Categories | Flipkart.com";
		Assert.assertEquals("Condition true", actualTitle, expectedTitle);
		System.out.println("Assertion Passed");

	}

}
