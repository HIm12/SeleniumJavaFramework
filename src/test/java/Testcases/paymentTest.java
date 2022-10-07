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
import Pages.paymentsPage;
import config.PropertiesFile;

public class paymentTest extends BasePage {

	paymentsPage lp;
	private static Logger logger = LogManager.getLogger(paymentTest.class);

	public paymentTest() {
		super();

	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new paymentsPage(null);

	}

	@Test(priority = 18, groups = "smoke")
	public void paymentgiftcard() throws InterruptedException {

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
		Thread.sleep(2000);

		ProfilePage.profile(driver).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(3000);

		WebElement giftcard = driver.findElement(
				By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[2]/div[3]/div[1]/div[2]/a[1]/div"));
		Actions acts = new Actions(driver);
		acts.moveToElement(giftcard).click().perform();
		logger.info("paymentgiftcard");
		driver.navigate().refresh();
		String actualTitle = driver.getTitle();
		String expectedTitle = "My Profile";
		Assert.assertEquals("Condition true", actualTitle, expectedTitle);
		System.out.println("Assertion Passed");

	}

	@Test(priority = 19)
	public void paymentsavedcard() throws InterruptedException {
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
		Thread.sleep(2000);

		ProfilePage.profile(driver).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(3000);

		WebElement saved_card = driver.findElement(
				By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[2]/div[3]/div[1]/div[2]/a[3]/div"));
		Actions acts = new Actions(driver);
		acts.moveToElement(saved_card).click().perform();
		logger.info("paymentsavedcard");
		driver.navigate().refresh();
		
	}

}