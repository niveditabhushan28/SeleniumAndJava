package com.horolab.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.horolab.qa.base.BaseTest;

public class HomeLoginPage extends BaseTest{

	HomeLoginPage homeLoginPage;
	public HomeLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@class='mat-button ng-star-inserted']/span[contains(text(),Login)]")
	WebElement LoginBtn;
	
	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	
	public LoginPage login() {
		getLoginBtn().click();
		return new LoginPage();
	}


}
