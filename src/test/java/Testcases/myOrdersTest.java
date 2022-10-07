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
import config.PropertiesFile;
import Pages.myOrderPage;
public class myOrdersTest extends BasePage {

	myOrderPage lp;
	private static Logger logger = LogManager.getLogger(myOrdersTest.class);

	public myOrdersTest() {
		super();

	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new myOrderPage(null);

	}

	@Test(priority = 10, groups = "sanity")
	public void myOrderstesting() throws InterruptedException {

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
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		js.executeScript("window.scrollBy(0,-650)");
		Thread.sleep(3000);
		
		WebElement my_orders = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[2]/div[1]/div[1]/div/a"));
		Actions acts = new Actions(driver);
		acts.moveToElement(my_orders).click().perform(); 
		logger.info("Hover to click on orders");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Flipkart.com: Your Order History";
		Assert.assertEquals("Condition true", actualTitle, expectedTitle);
		System.out.println("Assertion Passed");
	}
	

}