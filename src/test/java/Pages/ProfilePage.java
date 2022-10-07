package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {
	WebDriver driver;
	public ProfilePage(WebDriver driver) {
		this.driver = driver;
	}
	
//	public static WebElement min_dropdown(WebDriver driver) {
//		WebElement min_dropdown = driver.findElement(By.xpath(
//				"//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[2]/div[4]/div[1]/select"));
//		Select sel  = new Select(min_dropdown);
//		sel.selectByValue("10000");
//		return min_dropdown;
//	}
	public static WebElement profile(WebDriver driver) {
	WebElement profile = driver.findElement(By.xpath(
			"//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/ul/li[1]/a/div"));
	return profile;
	}
	
	public static WebElement New_address(WebDriver driver) {
	WebElement New_address = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div"));
	return New_address;
	}
	
	public static WebElement name(WebDriver driver) {
		WebElement name = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div/form/div/div[2]/div[1]/input"));
		return name;
		}
	
	public static WebElement mobile_Digit(WebDriver driver) {
	WebElement mobile_Digit = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div/form/div/div[2]/div[2]/input"));
//	mobile_Digit.sendKeys(PropertiesFile.prop.getProperty("new_mobile_number"));
	return mobile_Digit;
	}
	
	public static WebElement pincode(WebDriver driver) {
	WebElement pincode = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div/form/div/div[3]/div[1]/input"));
//	pincode.sendKeys(PropertiesFile.prop.getProperty("pincode"));
	return pincode;
	}
	
	public static WebElement locality(WebDriver driver) {
	WebElement locality = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div/form/div/div[3]/div[2]/input"));
//	locality.sendKeys(PropertiesFile.prop.getProperty("locality"));
	return locality;
	}
	
	public static WebElement address(WebDriver driver) {
	WebElement address = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div/form/div/div[4]/div/div[1]/textarea"));
//	address.sendKeys(PropertiesFile.prop.getProperty("address"));
	return address;
	}
	
	
	public static WebElement city(WebDriver driver) {
	WebElement city = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div/form/div/div[5]/div[1]/div[1]/input"));
//	city.sendKeys(PropertiesFile.prop.getProperty("city"));
	return city;
	}
	
	
	
	public static WebElement landmark(WebDriver driver) {
	WebElement landmark = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div/form/div/div[6]/div[1]/input"));
//	landmark.sendKeys(PropertiesFile.prop.getProperty("landmark"));
	return landmark;
	}
	
	
	public static WebElement address_type(WebDriver driver) {
	WebElement address_type = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div/form/div/div[7]/div/div/label[1]/div[1]"));
//	address_type.click();
	return address_type;
	}
	
	public static WebElement save_button(WebDriver driver) {
	WebElement save_button = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div/div[1]/div/div/form/div/div[8]/button[2]"));
//	save_button.click();
//	Thread.sleep(3000);
	return save_button;
	}
}
