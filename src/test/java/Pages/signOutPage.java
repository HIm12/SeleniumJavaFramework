package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signOutPage {
	WebDriver driver;
	public signOutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public static WebElement logout(WebDriver driver) {
		WebElement logout = driver
				.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div"));
		return logout;
	}
}
