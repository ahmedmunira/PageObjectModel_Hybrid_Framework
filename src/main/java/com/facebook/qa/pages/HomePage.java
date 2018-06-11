package com.facebook.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.facebook.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath ="//span[contains(text(),'James')]")
	WebElement profile;
	
	@FindBy(linkText="Home")
	WebElement home;
	
	@FindBy(linkText="Find Friends")
	WebElement findFriends;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyhomePageTitle() {
	       return driver.getTitle();
		
	}
	public ProfilePage clickOnProfileLink() {
		profile.click();
		return new ProfilePage();
	}

	public HomePage clickOnHomePage() {
		home.click();
		return new HomePage();
	}
	
	public HomePage clickOnFindFriendsLink() {
		findFriends.click();
		return new HomePage();
		
		
	}
}
