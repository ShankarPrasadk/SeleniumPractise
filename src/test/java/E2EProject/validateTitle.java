package E2EProject;

import static org.testng.Assert.assertEquals;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sun.tools.sjavac.Log;

import pageObjects.LandingPage;
import resources.base;

public class validateTitle extends base {
	public static Logger Log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initilize() throws IOException {
		driver = initializeDriver();
		Log.info("Driver is Initialized Succesffuly");
		driver.get(prop.getProperty("url"));
		// driver.get("https://qaclickacademy.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		Log.info("Navigated to the site");
	}

	@Test
	public void basepageNavigation() throws IOException {

		LandingPage lp = new LandingPage(driver);
		String text = lp.PageTitleHighlight().getText();
		Assert.assertEquals(text, "FEATURED COURSES");	
		System.out.println(text);
		Assert.assertTrue(lp.Contact().isDisplayed());
		Log.info(text);
		Log.info("Verified if the text is present or not and printed");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		Log.info("Tested and the Browser is closed");
	}

}