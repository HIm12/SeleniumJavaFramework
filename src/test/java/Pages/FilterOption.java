package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FilterOption {

	WebDriver driver;

	public FilterOption(WebDriver driver) {
		this.driver = driver;
	}

	public static WebElement min_dropdown(WebDriver driver) {
		WebElement min_dropdown = driver.findElement(By.xpath(
				"//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[2]/div[4]/div[1]/select"));
		Select sel  = new Select(min_dropdown);
		sel.selectByValue("10000");
		return min_dropdown;
	}

	public static WebElement max_dropdown(WebDriver driver) {
		WebElement max_dropdown = driver.findElement(By.cssSelector("#container > div > div._36fx1h._6t1WkM._3HqJxg > div._1YokD2._2GoDe3 > div._1YokD2._3Mn1Gg.col-2-12 > div > div:nth-child(1) > div > section._2yz7eI._2hbLCH > div._2b0bUo > div._3uDYxP > select"));
		Select sel1  = new Select(max_dropdown);
		sel1.selectByValue("30000");
		return max_dropdown;

	}
}