package com.HrOnBoarding.QA.Pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.redhu.Base.TestBase;

public class AddClientByAdmin extends TestBase {

	@FindBy(xpath = "//button[text()='Client Management']")
	WebElement clientManagementButton;

	@FindBy(xpath = "//button[text()='Add Client']")
	WebElement addClientButton;

	@FindBy(xpath = "//input[@placeholder='Company Name']")
	WebElement companyNameTextField;

	@FindBy(xpath = "//input[@placeholder='Client Name']")
	WebElement clientNameTextField;

	@FindBy(xpath = "//input[@placeholder='Email ID']")
	WebElement emailTextField;

	@FindBy(xpath = " //input[@placeholder='(999) 999-9999']")
	WebElement phoneNumberTextField;

	@FindBy(xpath = "//input[@placeholder='URL']")
	WebElement urlTextField;
	
	@FindBy(xpath="//input[@name='file']")
	WebElement uploadLogo;
	
	@FindBy(xpath = "//button[text()='Add']")
	WebElement addClientDone;

	public AddClientByAdmin() throws IOException {

		PageFactory.initElements(driver, this);

	}

	public void addClient(String companyName, String clientName, String emailId, String phoneNum, String url,String logo)
			throws InterruptedException {

		clientManagementButton.click();
		Thread.sleep(3000);
		addClientButton.click();
		Thread.sleep(2000);
		companyNameTextField.click();
		companyNameTextField.sendKeys(companyName);
		clientNameTextField.sendKeys(clientName);
		emailTextField.sendKeys(emailId);
		phoneNumberTextField.sendKeys(phoneNum);
		urlTextField.sendKeys(url);
		uploadLogo.sendKeys(logo);
		Thread.sleep(2000);
		addClientDone.click();
		
		
		
		
		
		
		
		
		
	}

}
