package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddtoCart {
	WebDriver driver;

	public AddtoCart(WebDriver driver) {
		this.driver = driver;

	}
	
	public static WebElement select_product(WebDriver driver) {
	WebElement select_product = driver.findElement(
			By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[5]/div/div/div/a/div[2]/div[1]/div[1]"));
	return select_product;
	}
}