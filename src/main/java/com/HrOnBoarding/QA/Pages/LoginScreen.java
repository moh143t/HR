package com.HrOnBoarding.QA.Pages;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.redhu.Base.TestBase;

public class LoginScreen extends TestBase {

	// creation of object repositry

	@FindBy(xpath = "//input[@id='email']")
	WebElement adminEmailAdressTextField;

	@FindBy(xpath = "//input[@id='inputPassword']")
	WebElement adminPasswordTextField;

	@FindBy(xpath = "//button[text()='Login']")
	WebElement adminLoginButton;

	@FindBy(xpath = "//a[text()='Forgot Password?']")
	WebElement forgotPasswordLink;

	@FindBy(xpath = "//label[@for='rememberMe']")
	WebElement rememberMeLink;

	@FindBy(xpath = "//button[text()='Dashboard']")
	WebElement adminDasbboardButton;

	// initialiation of the page object
	public LoginScreen() throws IOException {
		PageFactory.initElements(driver, this);
	}

	// Writing actions of this page

	public void adminLogin(String us, String psd) {
		adminEmailAdressTextField.sendKeys(us);
		adminPasswordTextField.sendKeys(psd);
		adminLoginButton.click();
		String text = adminDasbboardButton.getText();
		Assert.assertEquals(text, "Dashboard", "User is not able to login successfully");
	}

	public void forgotPasswordIsDisplay() {
		String forgetText = forgotPasswordLink.getText();
		Assert.assertEquals(forgetText, "Forgot Password?", "Forgot link not found on Login page");

	}

	public void rememberMeIsDisplay() {
		String remText = rememberMeLink.getAttribute("for");
		Assert.assertEquals(remText, "rememberMe", "Remeber me link is not found on login page");

	}

}
