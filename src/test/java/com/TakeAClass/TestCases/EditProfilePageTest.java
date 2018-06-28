package com.TakeAClass.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TakeAClass.qa.pages.EditProfilePage;
import com.TakeAClass.qa.pages.LoginPage;
import com.redhu.Base.TestBase;

public class EditProfilePageTest extends TestBase {

	LoginPage lgn;
	EditProfilePage ed;

	public EditProfilePageTest() throws IOException {
		super();
	}
	
	

	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		lgn = new LoginPage();
		ed = new EditProfilePage();
	}

	@Test(enabled = true)
	public void verifyFirstNameUpdate() throws InterruptedException {
		lgn.userLogin(prop.getProperty("userEmailAdress"), prop.getProperty("userPasswordDetails"));
		ed.updateUserFirstName();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
