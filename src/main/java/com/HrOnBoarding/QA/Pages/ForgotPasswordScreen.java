package com.HrOnBoarding.QA.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.redhu.Base.TestBase;

public class ForgotPasswordScreen extends TestBase {

	@FindBy(xpath = "//a[text()='Forgot Password?']")
	WebElement forgotPasswordLink;

	@FindBy(xpath = "//input[@id='inputEmail']")
	WebElement emailTextField;

	@FindBy(xpath = "//button[text()='Send']")
	WebElement sendButton;

	@FindBy(xpath = "//div[@role='alert']")
	WebElement successAlertBox;

	@FindBy(xpath = "//p[@class='forgot-password']")
	WebElement forgotPasswordDefaultText;
	
	
	@FindBy(linkText="Sign in.")
	WebElement returnSingIn;

	public ForgotPasswordScreen() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public void forgotPasswordEmailSent(String email) {

		forgotPasswordLink.click();
		emailTextField.sendKeys(email);
		sendButton.click();
		String confirmationText = successAlertBox.getAttribute("role");
		Assert.assertEquals(confirmationText, "alert", "forgot password email success message is not appearing.");
	}

	public void forgetPasswordDefaultText() {

		forgotPasswordLink.click();
		String forgetText = forgotPasswordDefaultText.getText();
		Assert.assertEquals(forgetText,
				"Forget your password? No worries! Just enter your email address and we’ll send you a password reset link.",
				"Forgot password screen default text is not correct.");
	}
	
	public void returnSignInScreen(){
		forgotPasswordLink.click();
		returnSingIn.click();
		String text = forgotPasswordLink.getText();
		Assert.assertEquals(text, "Forgot Password?" , "User is not redirected on Login Screen");
	}
	

}
