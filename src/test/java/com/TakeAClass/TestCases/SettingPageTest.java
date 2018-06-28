package com.TakeAClass.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TakeAClass.qa.pages.LoginPage;
import com.TakeAClass.qa.pages.SettingPage;
import com.redhu.Base.TestBase;

public class SettingPageTest extends TestBase {
	LoginPage lgn;
	SettingPage stPage;

	public SettingPageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		lgn = new LoginPage();
		stPage = new SettingPage();
	}

	@Test(enabled = true)
	public void userLogoutTest() throws IOException, InterruptedException {
		lgn.userLogin(prop.getProperty("userEmailAdress"), prop.getProperty("userPasswordDetails"));
		stPage.userLogout();
	}

	@Test(enabled = true)
	public void changeUserPasswordTest() throws InterruptedException {
		lgn.userLogin(prop.getProperty("userEmailAdress"), prop.getProperty("userPasswordDetails"));
		stPage.changeUserPassword();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
