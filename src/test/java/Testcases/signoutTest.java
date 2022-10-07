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
import Pages.signOutPage;
import config.PropertiesFile;

public class signoutTest extends BasePage {

	signOutPage lp;
	private static Logger logger = LogManager.getLogger(signoutTest.class);

	public signoutTest() {
		super();

	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new signOutPage(null);

	}

	@Test(priority = 21, groups = "smoke")
	public void SignOutTesting() throws InterruptedException {
		LoginPage.login_btn_click(driver);
		LoginPage.username(driver).sendKeys(PropertiesFile.prop.getProperty("username"));
		LoginPage.password(driver).sendKeys(PropertiesFile.prop.getProperty("password"));
		Thread.sleep(2000);
		LoginPage.submit(driver).click();
		Thread.sleep(4000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,-5000)");
		Thread.sleep(2000);

		WebElement mouse_hover = driver
				.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div"));

		Actions act = new Actions(driver);

		act.moveToElement(mouse_hover).perform();
		Thread.sleep(2000);

		signOutPage.logout(driver).click();
		logger.info("signout performed");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		Assert.assertEquals("Condition true", actualTitle, expectedTitle);
		System.out.println("Assertion Passed");

	}

}
