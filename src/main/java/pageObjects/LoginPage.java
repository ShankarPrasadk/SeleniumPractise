package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	// Inside Login

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By Email = By.id("user_email");
	By Password = By.id("user_password");
	By LoginEnter = By.name("commit");

	public WebElement Email() {
		return driver.findElement(Email);
	}

	public WebElement Password() {
		return driver.findElement(Password);
	}

	public WebElement LoginEnter() {
		return driver.findElement(LoginEnter);
	}

}
