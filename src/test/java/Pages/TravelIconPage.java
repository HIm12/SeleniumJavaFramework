package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelIconPage {
	WebDriver driver;

	public TravelIconPage(WebDriver driver) {
		this.driver = driver;
	}
	public static WebElement travel(WebDriver driver) {
		WebElement travel = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[8]/a/div[2]"));
		return travel;
	}
}
