package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopOfferPage {
	WebDriver driver;

	public TopOfferPage(WebDriver driver) {
		this.driver = driver;
	}

	public static WebElement top_offer(WebDriver driver) {
	WebElement top_offer = driver
			.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/a/div[2]"));
	return top_offer;
	}

}
