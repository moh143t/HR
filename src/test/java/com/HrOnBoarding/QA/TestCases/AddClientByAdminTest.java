package com.HrOnBoarding.QA.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.HrOnBoarding.QA.Pages.AddClientByAdmin;
import com.HrOnBoarding.QA.Pages.LoginScreen;
import com.redhu.Base.TestBase;

public class AddClientByAdminTest extends TestBase {
	AddClientByAdmin addClientByAdminObj;
	LoginScreen loginAdminObj;

	public AddClientByAdminTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		addClientByAdminObj = new AddClientByAdmin();
		loginAdminObj = new LoginScreen();
	}

	@Test
	public void addClientByAdminUser() throws InterruptedException {
		
		loginAdminObj.adminLogin(prop.getProperty("userEmailAdress"), prop.getProperty("userPasswordDetails"));
		Thread.sleep(2000);
		addClientByAdminObj.addClient(prop.getProperty("CompanyName"), prop.getProperty("ClientName"),
				prop.getProperty("EmailID"), prop.getProperty("PhoneNumber"), prop.getProperty("URL"), prop.getProperty("logo"));

	}

	@AfterMethod
	public void tearDown() {
		// driver.quit();

	}

}
