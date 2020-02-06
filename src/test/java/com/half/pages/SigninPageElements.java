package com.half.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.half.testbase.BaseClass;
import com.half.utils.CommonMethods;

public class SigninPageElements extends CommonMethods {

	@FindBy(xpath="//div[@id='divLogo']")
	public WebElement logo;
	
	@FindBy(id="logInPanelHeading")
	WebElement loginLabel;
	
	@FindBy(id="txtUsername")
	public WebElement username;
	
	@FindBy(name="txtPassword")
	public WebElement password;
	
	@FindBy(css="input[name='Submit']")
	public WebElement loginBtn;
	
	@FindBy(id="spanMessage")
	public WebElement errorMsg;
	
	//to initialize these elements we need PageFactory class
	public SigninPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
		
	}
	
	//let's create a method for login (we use every time when we enter the webpage
	/**
	 * This method will do the logging in to the page 
	 * @param uid
	 * @param pwd
	 */
	public void login(String uid, String pwd) {
		sendText(username, uid);
		sendText(password, pwd);
		jsClick(loginBtn);
		
	}
	
}









