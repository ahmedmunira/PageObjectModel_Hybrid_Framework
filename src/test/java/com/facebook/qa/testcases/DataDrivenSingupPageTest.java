package com.facebook.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.facebook.qa.base.TestBase;
import com.facebook.qa.pages.SignupPage;
import com.facebook.qa.util.TestUtil;


public class DataDrivenSingupPageTest extends TestBase {
	
	SignupPage signupPage;
	String sheetName = "signupData";
	
	public DataDrivenSingupPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		signupPage= new SignupPage();
		
	}
	
	@DataProvider
	public Object[][] getSignuptData() {
		Object data [][] = TestUtil.getTestData(sheetName);
		return data;
	}

	@Test(dataProvider ="getSignuptData")
	public void signupnWithMultipleData(String firstname, String lastname, String email, String password ) {
	signupPage.singup(firstname, lastname, email, password);
		
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
