package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage {
	WebDriver driver;

	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
	}
	public static WebElement contact(WebDriver driver) {
	WebElement contact = driver.findElement(By.xpath("//*[@id=\"container\"]/div/footer/div/div[3]/div[1]/div[1]/a[1]"));
	return contact;
	}
	
	public static WebElement help_center(WebDriver driver) {
		WebElement help_center = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div/div[2]/div[2]/div[1]/div/div/a"));
		return help_center;
		
	}
}
