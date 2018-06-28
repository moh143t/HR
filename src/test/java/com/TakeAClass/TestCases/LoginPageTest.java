package com.TakeAClass.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TakeAClass.qa.pages.LoginPage;
import com.redhu.Base.TestBase;

public class LoginPageTest extends TestBase {

	LoginPage lgn;

	public LoginPageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		lgn = new LoginPage();
	}

	@Test(enabled=false)
	public void loginPageTiteTest() {

		String title = lgn.getTitle();
		Assert.assertEquals(title, "TakeAClass1", "Title has matched.");
	}

	@Test(enabled=true)
	public void userLoginTest() throws InterruptedException {
		lgn.userLogin(prop.getProperty("userEmailAdress"), prop.getProperty("userPasswordDetails"));

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
