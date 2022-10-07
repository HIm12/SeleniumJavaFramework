package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarrerPage {
	WebDriver driver;
	public CarrerPage(WebDriver driver) {
		this.driver = driver;
	}
	public static WebElement career(WebDriver driver) {

		WebElement career = driver.findElement(By.xpath("//*[@id=\"container\"]/div/footer/div/div[3]/div[1]/div[1]/a[3]"));
		return career;
	}
}
