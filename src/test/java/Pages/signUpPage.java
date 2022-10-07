package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signUpPage {
	WebDriver driver;
	public signUpPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public static WebElement New_to_flipkart(WebDriver driver) {
		WebElement New_to_flipkart = driver
				.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[6]/a"));
		return New_to_flipkart;
}

	public static WebElement enter_mobile(WebDriver driver) {
	WebElement enter_mobile = driver
			.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
	return enter_mobile;
	}

	public static WebElement Continue(WebDriver driver) {
	WebElement Continue = driver
			.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button"));
	return Continue;
	}

	public static WebElement set_password(WebDriver driver) {
	WebElement set_password = driver
			.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/input"));
	return set_password;
	}

	public static WebElement signup(WebDriver driver) {
	WebElement signup = driver
			.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[5]/button[1]"));
	return signup;
	}

	public static WebElement existing_user(WebDriver driver) {
	WebElement existing_user = driver
			.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[5]/button[2]/span"));
	return existing_user;
	}
}
