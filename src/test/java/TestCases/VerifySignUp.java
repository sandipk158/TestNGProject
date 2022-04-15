package TestCases;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.SignInPageObject;
import PageObjectModel.SignUpPageObject;
import Resources.BaseClass;
import Resources.Constants;

public class VerifySignUp extends BaseClass {
	
	@Test
	public void SignUp() throws InterruptedException {
		
		SignInPageObject spo=new SignInPageObject(driver);
		spo.SignUpPage().click();
		Thread.sleep(5000);
		SignUpPageObject sup=new SignUpPageObject(driver);
		//sup.EnterFirstName().sendKeys("Sandip");
		sup.EnterFirstName().sendKeys(Constants.FirstName);
		//sup.EnterLastName().sendKeys("Kurekar");
		sup.EnterLastName().sendKeys(Constants.LastName);
		sup.EnterEmail().sendKeys("Sandip.Kurekar@gmail.com");
		sup.EnterCompany().sendKeys("Technogeeks");
		sup.EnterPhone().sendKeys("77090636564");
		sup.IAgree().click();
		sup.ClickPolicy().click();
		
		Select J=new Select(sup.EnterJobTitle());
		Thread.sleep(2000);
		J.selectByIndex(5);
		
		Select E=new Select(sup.SelectEmployee());
		Thread.sleep(2000);
		E.selectByIndex(1);
		
		Select C=new Select(sup.SelectCountry());
		Thread.sleep(2000);
		C.selectByIndex(1);
		
		Select S=new Select(sup.SelectState());
		Thread.sleep(2000);
		S.selectByIndex(5);
		
	}

}
