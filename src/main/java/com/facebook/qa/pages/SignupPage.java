package com.facebook.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebook.qa.base.TestBase;

public class SignupPage extends TestBase {
	
	@FindBy(name = "firstname")
	WebElement firstName;
	
	@FindBy(name = "lastname")
	WebElement lastName;
	
	@FindBy(name = "reg_email__")
	WebElement emailId;
	
	
	@FindBy(name = "reg_passwd__")
	WebElement password;
	
	@FindBy(name = "websubmit")
	WebElement signup;
	
	public SignupPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void singup(String fn, String ln, String emid, String pwd) {
		firstName.sendKeys(fn);
		lastName.sendKeys(ln);
		emailId.sendKeys(emid);
		password.sendKeys(pwd);
		signup.click();
		
	}
	
	
	

}
