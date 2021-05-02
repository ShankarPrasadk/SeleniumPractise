package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\91994\\Eclipse-workspace\\E2EProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("chrome")) {
			//execute chrome driver
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91994\\Desktop\\eclipse\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(browsername.equals("edge")) {
			//execute edge driver
			System.setProperty("webdriver.edge.driver", "‪C:\\Users\\91994\\Desktop\\eclipse\\msedgedriver.exe");
			driver = new EdgeDriver();
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
		
	
	
}
