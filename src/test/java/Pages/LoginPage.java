package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	public static WebElement login_btn_click(WebDriver driver) {

		WebElement login = driver
				.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a"));
		return login;
	}

	public static WebElement username(WebDriver driver) {
		WebElement username = driver
				.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		return username;

	}

	public static WebElement password(WebDriver driver) {
		WebElement password = driver.findElement(By.cssSelector(
				"body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div:nth-child(2) > input"));
		return password;
	}
	
	public static WebElement submit(WebDriver driver) {
		WebElement submit = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button"));
		return submit;
	}
	
	public static WebElement cross_btn(WebDriver driver) {
		WebElement cross_btn = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		return cross_btn;
	}
	
}