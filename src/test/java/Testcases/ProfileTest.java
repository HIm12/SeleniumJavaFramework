package Testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePage.BasePage;
import Pages.LoginPage;
import Pages.ProfilePage;
import config.PropertiesFile;
public class ProfileTest extends BasePage {

	ProfilePage lp;
	private static Logger logger = LogManager.getLogger(ProfileTest.class);

	public ProfileTest() {
		super();

	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new ProfilePage(null);

	}

	@Test(priority = 9, groups = "sanity")
	public void profiletesing() throws InterruptedException {

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
		logger.info("mouse hover on profile");
		Thread.sleep(2000);

		ProfilePage.profile(driver).click();
		logger.info("clicked on profile");
		Thread.sleep(2000);
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		js.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(3000);
		
		
		WebElement Manage_address = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[2]/div[2]/div[1]/div[2]/a[2]/div"));
		Actions acts = new Actions(driver);
		acts.moveToElement(Manage_address).click().perform();
		logger.info("Manage Address");
		Thread.sleep(2000);
		
		ProfilePage.New_address(driver).click();
		Thread.sleep(2000);
		
		ProfilePage.name(driver).sendKeys(PropertiesFile.prop.getProperty("name"));
		
		ProfilePage.mobile_Digit(driver).sendKeys(PropertiesFile.prop.getProperty("new_mobile_number"));
		
		ProfilePage.pincode(driver).sendKeys(PropertiesFile.prop.getProperty("pincode"));
		
		ProfilePage.address(driver).sendKeys(PropertiesFile.prop.getProperty("address"));
		
		ProfilePage.city(driver).sendKeys(PropertiesFile.prop.getProperty("city"));
		
		ProfilePage.locality(driver).sendKeys(PropertiesFile.prop.getProperty("locality"));
		
		Select state = new Select(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div/form/div/div[5]/div[2]/div/div[2]/select")));
		state.selectByVisibleText("Delhi");
		
		ProfilePage.landmark(driver).sendKeys(PropertiesFile.prop.getProperty("landmark"));
		
		ProfilePage.address_type(driver).click();
		logger.info("Address Enterted");
		
		ProfilePage.save_button(driver).click();
		Thread.sleep(2000);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Manage Addresses";
		Assert.assertEquals("Condition true", actualTitle, expectedTitle);
		System.out.println("Assertion Passed");
		
	}

}
