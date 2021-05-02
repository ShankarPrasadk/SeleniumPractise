package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	By Login = By.xpath("//a[contains(@href,'sign_in')]");
	By Home = By.xpath("//a[contains(text(),'Home')]");
	By Courses = By.xpath("//a[contains(text(),'Courses')]");
	By Videos = By.xpath("//a[contains(text(),'Videos')]");
	By InterviewGuide = By.xpath("//a[contains(text(),'Interview Guide')]");
	By Practise = By.xpath("//a[contains(text(),'Practise')]");
	By Blog = By.xpath("//a[contains(text(),'Blog')]");
	By About = By.xpath("//a[contains(text(),'About')]");
	By Contact = By.xpath("//a[contains(text(),'Contact')]");

	By PageTitleHighlight = By.xpath("//div/h2[contains(text(),'Featured')]");

	public WebElement LogIn() {
		return driver.findElement(Login);
	}

	public WebElement Home() {
		return driver.findElement(Home);
	}

	public WebElement Courses() {
		return driver.findElement(Courses);
	}

	public WebElement Videos() {
		return driver.findElement(Videos);
	}

	public WebElement InterviewGuide() {
		return driver.findElement(InterviewGuide);
	}

	public WebElement Practise() {
		return driver.findElement(Practise);
	}

	public WebElement Blog() {
		return driver.findElement(Blog);
	}

	public WebElement About() {
		return driver.findElement(About);
	}

	public WebElement Contact() {
		return driver.findElement(Contact);
	}

	public WebElement PageTitleHighlight() {
		return driver.findElement(PageTitleHighlight);
	}

}
