package com.HrOnBoarding.QA.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.HrOnBoarding.QA.Pages.ForgotPasswordScreen;
import com.redhu.Base.TestBase;

public class ForgotPasswordScreenTest extends TestBase {
	ForgotPasswordScreen forgetPasswordScreenObj;
	
	
	public ForgotPasswordScreenTest() throws IOException {
		super();
		
	}
	
	@BeforeMethod
	public void setUp() throws IOException{
		initialization();
	forgetPasswordScreenObj = 	new ForgotPasswordScreen();
	}
	
	@Test(enabled = false)
	public void verifyForgotPasswordEmailSent(){
		forgetPasswordScreenObj.forgotPasswordEmailSent(prop.getProperty("userEmailAdress"));
	}
	
	@Test(enabled = false)
	public void verifyForgotPasswordScreenDefaultText(){
		forgetPasswordScreenObj.forgetPasswordDefaultText();
	}
	
	@Test(enabled = true)
	public void verifyUserRerutnToLoginScreen(){
		forgetPasswordScreenObj.returnSignInScreen();
		
	}
	
	@AfterMethod
	public void tearDown(){
	driver.quit();
	}
	
	

}
