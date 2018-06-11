package com.facebook.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.facebook.qa.base.TestBase;

public class ProfilePage extends TestBase{
	
	@FindBy(xpath ="//title[@id='pageTitle']")
	WebElement proifleTitle;
	
	public String verifyProfilePageTitle() {
		return proifleTitle.getText();
		
	}
	
	public ProfilePage() {
		PageFactory.initElements(driver, this);
	}

}
