package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObject {
	public WebDriver driver; 
	
	private By FirstName=By.xpath("//input[@name='UserFirstName']");
	private By LastName=By.xpath("//input[@name='UserLastName']");
	private By WorkEmail=By.xpath("//input[@name='UserEmail']");
	private By JobTitle=By.xpath("//select[@name='UserTitle']");
	private By CompanyName=By.xpath("//Input[@name='CompanyName']");	
	private By Employee=By.xpath("//select[@name='CompanyEmployees']");
	private By Phone=By.xpath("//Input[@name='UserPhone']");
	private By Country=By.xpath("//select[@name='CompanyCountry']");
	private By State=By.xpath("//select[@name='CompanyState']");
	private By Agree=By.xpath("//div[@class='checkbox-ui']");
	private By Policy=By.xpath("//a[@href='https://www.salesforce.com/company/privacy/']");
	
	
	public SignUpPageObject(WebDriver driver2) {
		 // TODO Auto-generated constructor stub
		  this.driver=driver2;	  
		}
	
	public WebElement EnterFirstName() {
		
		return driver.findElement(FirstName);
	}
	
    public WebElement EnterLastName() {
		
		return driver.findElement(LastName);
	}

    public WebElement SelectEmployee() {
		
		return driver.findElement(Employee);
	}
    
    public WebElement EnterEmail() {
		
		return driver.findElement(WorkEmail);
	}
    
    public WebElement EnterJobTitle() {
		
		return driver.findElement(JobTitle);
	}
    
    public WebElement EnterCompany() {
    	
    	return driver.findElement(CompanyName);
    }
    
    public WebElement EnterPhone() {
    	
    	return driver.findElement(Phone);
    }
    
    public WebElement SelectCountry() {
    	
    	return driver.findElement(Country);
    }
    
    public WebElement SelectState() {
    	
    	return driver.findElement(State);
    }
    
    public WebElement IAgree() {
    	
    	return driver.findElement(Agree);
    }
    
public WebElement ClickPolicy() {
    	
    	return driver.findElement(Policy);
    }
}
