package com.TakeAClass.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TakeAClass.qa.pages.LoginPage;
import com.TakeAClass.qa.pages.SearchForTheClasses;
import com.redhu.Base.TestBase;

public class SearchClassFilters extends TestBase {

	SearchForTheClasses src;
	LoginPage lgn;

	public SearchClassFilters() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		src = new SearchForTheClasses();
		lgn = new LoginPage();

	}

	@Test(enabled = true)
	public void verificationOfSearchClassFilter_All() throws InterruptedException {
		lgn.userLogin(prop.getProperty("userEmailAdress"), prop.getProperty("userPasswordDetails"));
		src.searchClassByFilter_All();

	}

	@Test
	public void verificationOfSearchClassFilter_artAndCraft() throws InterruptedException {
		lgn.userLogin(prop.getProperty("userEmailAdress"), prop.getProperty("userPasswordDetails"));
		src.searchClassByFilter_artAndCraft();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
