package com.TakeAClass.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.redhu.Base.TestBase;

public class SearchForTheClasses extends TestBase {
	
	//Creation of Object Repositry
	
	@FindBy(xpath="//a[text()='Search For Classes']")
	WebElement seachForClassButton;
	
	@FindBy(xpath=" //a[@id='All']")  
	WebElement allClassFilterButton;
	
	@FindBy(xpath="//a[text()='All']")
	WebElement filterTextAll;
	
	@FindBy(xpath="//a[@id='68']")   // for QA server this will need to change
	WebElement art_craftFilterButton;
	
	@FindBy(xpath="//span[text()='art and craft']")   //need to check QA server
	WebElement art_craftFilterText;
	
	//initialization of Object Repositry
	
	public SearchForTheClasses() throws IOException{
		
		PageFactory.initElements(driver, this);
		
	}
	//Actions
	
	public void searchClassByFilter_All() throws InterruptedException{
		
		seachForClassButton.click();
		Thread.sleep(2000);
		allClassFilterButton.click();
		Thread.sleep(2000);
		String filter = filterTextAll.getText();
		Assert.assertEquals(filter, "All", "Search filter for All classes is not working");
		}
	
	
   public void searchClassByFilter_artAndCraft() throws InterruptedException{
		
		seachForClassButton.click();
		Thread.sleep(2000);
		art_craftFilterButton.click();
		Thread.sleep(2000);
		String filter = art_craftFilterText.getText();
		Assert.assertEquals(filter, "art and craft", "Search filter for Art & Craft classes is not working");
		}
	
	}
