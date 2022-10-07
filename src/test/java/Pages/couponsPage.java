package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class couponsPage {
	WebDriver driver;

	public couponsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public static WebElement my_coupons(WebDriver driver) {
		WebElement my_coupons = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[2]/div[4]/div[1]/div[2]/a[1]/div"));
		return my_coupons;
		
	}
}
