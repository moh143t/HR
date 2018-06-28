package com.HrOnBoarding.QA.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.HrOnBoarding.QA.Pages.LoginScreen;
import com.redhu.Base.TestBase;

public class LoginScreenTest2 extends TestBase {
	LoginScreen adminLogin;
	WebDriver driver;

	public LoginScreenTest2() throws IOException {
		super();
	}

	@BeforeClass
	public void setUp() throws IOException {
		initialization();
		driver = new FirefoxDriver();
		adminLogin = new LoginScreen();

	}

	
	@Test
	public void verifyForgotPasswordLinkIsAvailable() {
		adminLogin.forgotPasswordIsDisplay();

	}

	@Test (priority=1)
	public void verifyRememberMeLinkIsAvailable() {

		adminLogin.rememberMeIsDisplay();
	}
	
	@Test(enabled = true,priority=2)
	public void verifyAdminLogin() {
		adminLogin.adminLogin(prop.getProperty("userEmailAdress"), prop.getProperty("userPasswordDetails"));
	}


	@AfterClass
	public void tearDown() {
		driver.quit();

	}

}
