package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SearchItems {
	WebDriver driver;
	public SearchItems(WebDriver driver) {
		this.driver = driver;
	}
	
	public static WebElement search(WebDriver driver) {
		WebElement search = driver
				.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
//		search.sendKeys("NokiaFlip Phone 2660");
		return search;
		
	}
	
	public static WebElement search_btn(WebDriver driver) {
	WebElement search_btn = driver
			.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button"));
	return search_btn;
	}

}