package com.horolab.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.horolab.qa.base.BaseTest;

public class LoginPage extends BaseTest{

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//input[@placeholder='User Name']")
	WebElement userName;
	
	@FindBy(xpath ="//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath = "//span[contains(text(),'Sign In')]")
	WebElement signInBtn;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}

	public void userLogin(String user, String pwd) {
		getUserName().sendKeys(user);
		getPassword().sendKeys(pwd);
		getSignInBtn().click();
	}

	
// Add few more methods of login page

}
