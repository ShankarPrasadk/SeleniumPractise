package E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	public static Logger Log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		Log.info("Driver is Initialized Succesffuly");
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		Log.info("Navigated to the site");

	}

	@Test(dataProvider = "getData")
	public void basepageNavigation(String Username, String Password) throws InterruptedException {

		LandingPage lp = new LandingPage(driver);
		LoginPage logp = new LoginPage(driver);
		Thread.sleep(2000);
		lp.LogIn().click();
		Log.info("Login is selected Successfully");
		logp.Email().sendKeys(Username);
		logp.Password().sendKeys(Password);
		logp.LoginEnter().click();
		Log.info("Email and password are enter and checked");
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[1][2];
		data[0][0] = "Shankarkdjs@gmail.com";
		data[0][1] = "123456987";

		return data;

	}

	@AfterTest
	public void teardown() {
		driver.close();
		Log.info("tested succesfully and window is closed");
	}
}
