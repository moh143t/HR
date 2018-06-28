package com.TakeAClass.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.redhu.Base.TestBase;

public class LoginPage extends TestBase {

	// creation of object Repository
	
	
	
	@FindBy(xpath="//a[@href='/users/login']")
	WebElement userLoginButton;
	
	@FindBy(xpath="//a[text()='Sign Up']")
	WebElement singhUpText;



	@FindBy(name = "user[email]")
	WebElement emailField;

	@FindBy(name = "user[password]")   
	WebElement passwordField;

	@FindBy(xpath = "//input[@name='commit']")
	WebElement loginButton;

	@FindBy(xpath = "//span[@class='icon-user-dropdown']")
	WebElement userDropDownAerrow;

	// initilization of object reporitry
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public String getTitle() {
		return driver.getTitle();
	}

	public void userLogin(String us, String psd) throws InterruptedException {

		userLoginButton.click();
		emailField.sendKeys(us);
		passwordField.sendKeys(psd);
		loginButton.click();
		Thread.sleep(2000);
		String status = userDropDownAerrow.getAttribute("class");
		Assert.assertEquals(status, "icon-user-dropdown", "User is not able to Login successfully");

	}
	
	
	public void signUpText(){
		
	}
	
	

}
