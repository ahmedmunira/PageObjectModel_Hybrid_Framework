package com.facebook.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebook.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id = "pass")
	WebElement password;
	
	@FindBy (xpath = "//input[@value='Log In']")
	WebElement loginBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyLoginPageTitle() {
		return driver.getTitle();
		
	}
	
	public HomePage login(String user, String pwd) {
		email.clear();
		email.sendKeys(user);
		password.clear();
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}
	
	
	

}
