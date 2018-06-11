package com.facebook.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook.qa.base.TestBase;
import com.facebook.qa.pages.HomePage;
import com.facebook.qa.pages.LoginPage;
import com.facebook.qa.pages.ProfilePage;

public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	ProfilePage profilePage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUP() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
       
	}
	
	@Test(priority = 1)
	public void verifyHomePageTitleTest() {
		String title = homePage.verifyhomePageTitle();	
		Assert.assertEquals(title, "Facebook", "HomePageTitle did not match");

	}

	
	@Test(priority=2)
	public void clickOnProfileLinkTest() {
		 profilePage = homePage.clickOnProfileLink();
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
