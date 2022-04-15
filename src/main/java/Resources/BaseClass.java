package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver IntializeDriver() throws IOException {
		
		//To Read the properties file
		//FileInputStream fis=new FileInputStream("C:\\Users\\Minty\\eclipse-workspace\\E2ETestNGProject\\src\\main\\java\\Resources\\Data.properties");
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\Data.properties");
		
		//Properties prop=new Properties();
		prop=new Properties();
		prop.load(fis);
		String browsername=prop.getProperty("Browser");
		
		if(browsername.equals("Chrome")) {
			
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Minty\\Desktop\\Selenium Jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
	        WebDriverManager.chromedriver().setup(); // To Run script in Latest Browser Version
	        //WebDriverManager.chromedriver().browserVersion("79.0.9").setup();  // To run script on Specifice Browser version
			//WebDriver driver = new ChromeDriver();	
	        driver = new ChromeDriver();	
		}
		else if(browsername.equals("Firefox")) { 
			
			//Firefox Code
		}
		
        else if(browsername.equals("IE")) { 
			
			//IE Code
		}
		
        else { 
			
			System.out.println("You should choose any one of Browser");
		}
		
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;	
		
	}
	
	@BeforeClass
	public void LaunchBrowser() throws IOException {		
		driver=IntializeDriver();
		//driver.get("https://login.salesforce.com/?locale=in");
		driver.get(prop.getProperty("url"));
	}
	
	@AfterClass
	public void CloseBrowser() throws IOException {		
		
		//driver.quit();;
		
	}
	
}
