package com.HrOnBoarding.QA.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.redhu.Base.TestBase;

public class ClientManagementByAdmin extends TestBase {
	
	@FindBy(xpath="//button[text()='Client Management']")
	WebElement  clientManagemeent;
	
	
	
	
	
	
	
	
	

	public ClientManagementByAdmin() throws IOException {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	

}
