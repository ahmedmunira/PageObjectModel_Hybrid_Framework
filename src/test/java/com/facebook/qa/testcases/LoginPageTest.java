package com.facebook.qa.testcases;


import com.facebook.qa.base.TestBase;
import com.facebook.qa.pages.HomePage;
import com.facebook.qa.pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.apache.log4j.Logger;


public class LoginPageTest extends TestBase {

	LoginPage loginpage;
	HomePage homePage;
	Logger log = Logger.getLogger(LoginPageTest.class);

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		log.info("****************************** Starting test cases execution  *****************************************");
		initialization();
		loginpage = new LoginPage();
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		log.info("****************************** starting test case *****************************************");
		log.info("****************************** facebook login Title Test *****************************************");
		String title = loginpage.verifyLoginPageTitle();
		Assert.assertEquals(title, "Facebook - Log In or Sign Up");

		log.info("****************************** ending test case *****************************************");
		log.info("****************************** facebook login Title Test *****************************************");

	}
	
	@Test(priority = 2)
	public void loginWithValidDataTest() {

		log.info("****************************** starting test case *****************************************");
		log.info("****************************** facebook login Test *****************************************");
		homePage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		String title = homePage.verifyhomePageTitle();
		Assert.assertEquals(title, "Faceboo", "Login Page Title did not match");
		log.info("****************************** ending test case *****************************************");
		log.info("****************************** facebook login  Test *****************************************");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		log.info("****************************** Browser is closed *****************************************");

	}
}
