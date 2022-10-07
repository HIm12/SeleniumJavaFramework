package Testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePage.BasePage;
import Pages.LoginPage;
import Pages.ProfilePage;
import Pages.couponsPage;
import config.PropertiesFile;

public class CouponsTest extends BasePage {

	couponsPage lp;
	private static Logger logger = LogManager.getLogger(CouponsTest.class);

	public CouponsTest() {
		super();

	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new couponsPage(null);

	}

	@Test(priority = 11, groups = "sanity")
	public void coupontesing() throws InterruptedException {

		LoginPage.login_btn_click(driver);

		LoginPage.username(driver).sendKeys(PropertiesFile.prop.getProperty("username"));

		LoginPage.password(driver).sendKeys(PropertiesFile.prop.getProperty("password"));
		Thread.sleep(2000);

		LoginPage.submit(driver).click();
		Thread.sleep(2000);

		WebElement mouse_hover = driver
				.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div"));

		Actions act = new Actions(driver);

		act.moveToElement(mouse_hover).perform();
		logger.info("mouse hovered on profile");
		Thread.sleep(2000);

		ProfilePage.profile(driver).click();
		logger.info("click on profile");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		js.executeScript("window.scrollBy(0,-800)");
		Thread.sleep(3000);
		
		couponsPage.my_coupons(driver).click();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Flipkart.com: Your Rewards History";
		Assert.assertEquals("Condition true", actualTitle, expectedTitle);
		System.out.println("Assertion Passed");

	}

}
