package com.half.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.half.testbase.BaseClass;

public class AddEmployeePageElements {

	@FindBy(id = "firstName")
	public WebElement firstName;

	@FindBy(id = "middleName")
	public WebElement middleName;

	@FindBy(id = "lastName")
	public WebElement lastname;

	@FindBy(id = "employeeId")
	public WebElement empId;

	@FindBy(id = "chkLogin")
	public WebElement chkLgn;

	@FindBy(id = "user_name")
	public WebElement userName;

	@FindBy(id = "user_password")
	public WebElement userPwd;

	@FindBy(id = "btnSave")
	public WebElement saveBtn;
	
	@FindBy(xpath="//div[@id='profile-pic']/h1")
	public WebElement personalDetail;

	public AddEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
