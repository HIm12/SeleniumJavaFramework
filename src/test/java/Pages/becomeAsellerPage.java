package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class becomeAsellerPage {
	WebDriver driver;

	public becomeAsellerPage(WebDriver driver) {
		this.driver = driver;
	}

	public static WebElement seller(WebDriver driver) {
		WebElement seller = driver
				.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[4]/a/span"));
		return seller;
	}
}
