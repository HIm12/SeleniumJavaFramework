package Testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePage.BasePage;
import Pages.signUpPage;
import config.PropertiesFile;

public class signUpTest extends BasePage {

	signUpPage lp;
	private static Logger logger = LogManager.getLogger(signUpTest.class);

	public signUpTest() {
		super();

	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new signUpPage(null);

	}

	@Test(priority = 1,groups = "smoke")
	public void signUpTesting() throws Exception {

		signUpPage.New_to_flipkart(driver).click();
		Thread.sleep(3000);

		signUpPage.enter_mobile(driver).sendKeys(PropertiesFile.prop.getProperty("new_mobile_number"));
		Thread.sleep(2000);

		signUpPage.Continue(driver).click();
		Thread.sleep(3000);

		signUpPage.set_password(driver).sendKeys(PropertiesFile.prop.getProperty("password"));
		Thread.sleep(4000);

		signUpPage.signup(driver).click();
		Thread.sleep(2000);

		signUpPage.existing_user(driver).click();
		logger.info("Signup is done");
		Thread.sleep(3000);

		String actualTitle = driver.getTitle();
		String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		Assert.assertEquals("Condition true", actualTitle, expectedTitle);
		System.out.println("Assertion Passed");
	}


}
