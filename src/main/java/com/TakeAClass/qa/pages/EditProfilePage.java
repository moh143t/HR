package com.TakeAClass.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.redhu.Base.TestBase;

public class EditProfilePage extends TestBase {

	// creation of page facetory

	@FindBy(xpath = "//span[@class='icon-user-dropdown']")
	WebElement userDropDownAerrow;

	@FindBy(xpath = "//a[text()='Edit Profile']")
	WebElement editProfileButton;

	@FindBy(name = "user[first_name]")
	WebElement userFirstNameTextField;

	@FindBy(xpath = "//input[@value='Update']")
	WebElement updateEditInfoButton;

	// initiallization of page factory
	public EditProfilePage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	// Going to describe the actions on this page

	public void updateUserFirstName() throws InterruptedException {

		userDropDownAerrow.click();
		Thread.sleep(2000);
		editProfileButton.click();
		Thread.sleep(2000);
		userFirstNameTextField.clear();
		userFirstNameTextField.sendKeys("sandeep");
		Thread.sleep(3000);
		updateEditInfoButton.click();
		Thread.sleep(3000);
		userDropDownAerrow.click();
		Thread.sleep(3000);
		editProfileButton.click();
		Thread.sleep(3000);
		String name = userFirstNameTextField.getAttribute("value");
		Assert.assertEquals(name, "sandeep", "name is  not updated successfully");
	}

}
