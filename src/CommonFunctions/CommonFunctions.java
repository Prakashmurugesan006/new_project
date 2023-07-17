package CommonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {

	public static    Properties prop ;
	public static    WebDriver driver;
	
	public Properties loadPropertyFile() throws IOException {
		FileInputStream Fis = new FileInputStream("config.properties");
		Properties prop = new Properties();
		prop.load(Fis);
		return prop;
	}
	

@BeforeSuite
public void lanchBrowser() throws IOException {		
		loadPropertyFile();
		
		String browser = prop.getProperty("browser");
		String diverLocation = prop.getProperty("driverLocation");
		String url = prop.getProperty("url");
	
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", diverLocation);
			driver = new ChromeDriver();
		}
		else {
			System.setProperty("webdriver.gecko.driver", diverLocation);
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);

	}
	
	@AfterSuite
	public void tearDown() {
//		driver.quit();
	}
}
