package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class groceryPage {
	WebDriver driver;

	public groceryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public static WebElement grocery(WebDriver driver) {
		WebElement grocery = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[9]/a/div[2]"));
		return grocery;
	}
}
