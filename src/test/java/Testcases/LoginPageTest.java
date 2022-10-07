package Testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePage.BasePage;
import Com.ExitTest.Utils.TestDataExecution;
import Com.ExitTest.Utils.exceldata;
import config.PropertiesFile;
import Pages.LoginPage;

public class LoginPageTest extends BasePage {

	LoginPage lp;
	private static Logger logger = LogManager.getLogger(LoginPageTest.class);

	public LoginPageTest() {
		super();

	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new LoginPage(null);

	}

	@Test(priority = 2, groups = "smoke")
	public void loginUsingMobileNumber() throws Exception {

		LoginPage.login_btn_click(driver);

		LoginPage.username(driver).sendKeys(PropertiesFile.prop.getProperty("username"));

		Thread.sleep(2000);

		LoginPage.password(driver).sendKeys(PropertiesFile.prop.getProperty("password"));
		Thread.sleep(2000);
		logger.info("loginUsingMobileNumber");

		LoginPage.submit(driver).click();
		Thread.sleep(4000);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		Assert.assertEquals("Condition true", actualTitle, expectedTitle);
		System.out.println("Assertion Passed");

	}

	@Test(priority = 3, groups = "smoke")
	public void loginUsingEmailID() throws InterruptedException {
		LoginPage.login_btn_click(driver);

		LoginPage.username(driver).sendKeys(PropertiesFile.prop.getProperty("emailUsername"));

		Thread.sleep(2000);

		LoginPage.password(driver).sendKeys(PropertiesFile.prop.getProperty("password"));
		Thread.sleep(2000);

		LoginPage.submit(driver).click();
		logger.info("loginUsingEmailID");
		Thread.sleep(4000);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		Assert.assertEquals("Condition true", actualTitle, expectedTitle);
		System.out.println("Assertion Passed");
	}

	@Test(priority = 4, groups = "smoke")
	public void invalidEmailLogin() throws InterruptedException, IOException {

		LoginPage.login_btn_click(driver);

		LoginPage.username(driver).sendKeys(PropertiesFile.prop.getProperty("wrongEmailUsername"));

		Thread.sleep(2000);

		LoginPage.password(driver).sendKeys(PropertiesFile.prop.getProperty("password"));
		Thread.sleep(2000);

		LoginPage.submit(driver).click();
		logger.info("invalidEmailLogin");
		Thread.sleep(2000);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Flipkart";
		Assert.assertEquals("Condition true", actualTitle, expectedTitle);
		System.out.println("Assertion Failed");

	}

	@Test(priority = 5, groups = "smoke")
	public void invalidMobileNumberLogin() throws InterruptedException, IOException {

		LoginPage.login_btn_click(driver);

		LoginPage.username(driver).sendKeys(PropertiesFile.prop.getProperty("invalidmobileNo"));

		Thread.sleep(2000);

		LoginPage.password(driver).sendKeys(PropertiesFile.prop.getProperty("Password1"));
		Thread.sleep(2000);

		LoginPage.submit(driver).click();
		logger.info("invalidMobileNumberLogin");
		Thread.sleep(2000);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Flipkart";
		Assert.assertEquals("Condition true", actualTitle, expectedTitle);
		System.out.println("Assertion Failed");

	}

	@Test(priority = 22)
	public void excellogintesting() throws Exception {
		LoginPage.login_btn_click(driver);

		exceldata excel = new exceldata();
		String EXECUTION_REQUIRED = excel.readingData(2, 1);
		TestDataExecution.toCheckExecutionRequired(EXECUTION_REQUIRED);
		String USERID = excel.readingData(0, 1);
		String PASSWORD = excel.readingData(1, 1);
		LoginPage.username(driver).sendKeys(USERID);
		LoginPage.password(driver).sendKeys(PASSWORD);
		LoginPage.submit(driver).click();
		logger.info("excellogintesting");
		Thread.sleep(4000);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		Assert.assertEquals("Condition true", actualTitle, expectedTitle);
		System.out.println("Assertion Passed");
	}

}
