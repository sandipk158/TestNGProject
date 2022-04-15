package TestCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.SignInPageObject;
import Resources.BaseClass;
import Resources.Constants;

public class VerifySignIn extends BaseClass{
	
	/*@Test
	public void LaunchBrowser() throws IOException {		       This Method define in BaseClass
		driver=IntializeDriver();
		driver.get("https://login.salesforce.com/?locale=in");*/
	
	@Test(dataProvider="demo")
	public void EnterCredentials(String username,String password) {
		
		//try {
				
		SignInPageObject spo=new SignInPageObject(driver);
		 // driver.findElement(By.xpath("")).sendKeys("Sandip");
		  //spo.enterUserName().sendKeys("Sandip");
		  //spo.enterPassword().sendKeys("secure123");
		  spo.enterUserName().sendKeys(username);
		  spo.enterPassword().sendKeys(password);
		  spo.clickOnLogin().click();
		  //spo.forgotYourPass().click();
		//}
		//catch(Exception e) {			
		//}
		  
		    String Actual=driver.findElement(By.xpath("//div[@id='error']")).getText();
		    String Expected="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		    
		    //Assert.assertEquals(Actual, Expected); //Hard Assert
		    
			SoftAssert sp=new SoftAssert(); //Soft Assert
			sp.assertEquals(Actual, Expected);
			System.out.println("Hello");
			sp.assertAll();
	}
	
	 @DataProvider
	 public Object[][] demo() throws InterruptedException{
	  
	  Object[][] data=new Object[2][2];
	  
	  //correct username and password
	  //data[0][0]="test1";  
	  data[0][0]=Constants.FirstUserName;
	  //data[0][1]="Secure123";	
	  data[0][1]=Constants.FirstPassward;
	  
	  Thread.sleep(2000);
	  //incorrect username and password
	  //data[1][0]="test2";
	  data[1][0]=Constants.SecondUserName;
	  //data[1][1]="Secure456";
	  data[1][1]=Constants.SecondPassward;
	 
	  return data;
	  	  
	 } 
	 
	public void ClickforgotPassward() throws InterruptedException {
		
		SignInPageObject obj=new SignInPageObject(driver);
		Thread.sleep(5000);
		obj.forgotYourPass().click();	   
	
	}

}
