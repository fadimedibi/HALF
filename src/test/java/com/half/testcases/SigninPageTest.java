package com.half.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.half.pages.SigninPage;
import com.half.pages.SigninPageElements;
import com.half.utils.CommonMethods;
import com.half.utils.ConfigsReader;
import com.half.utils.Constants;
import com.half.utils.ExcelUtility;

public class SigninPageTest extends CommonMethods{

//	@Test(groups="smoke")
	public void signinTest() {
	
		SigninPage signin=new SigninPage();
		sendText(signin.username, ConfigsReader.getProperty("username"));
		sendText(signin.password, ConfigsReader.getProperty("password"));
			
		click(signin.loginBtn);
		
	//	signin.loginBtn.click();
	//	jsClick(signin.loginBtn);
	
		}
	
	//negative Test case for Login
	// enter username, leave password  then login
//	@Test(groups="regression")
	public void negativeLogin() {
		
		SigninPageElements signin=new SigninPageElements();
		sendText(signin.username, ConfigsReader.getProperty("username"));
		click(signin.loginBtn);
		String expectedError="Password cannot be empty";
		Assert.assertEquals(signin.errorMsg.getText(), expectedError,"Error message text is not match");
		
			
	}
	
	@Test(dataProvider="getData")
	public void multipleLogin(String uid, String pwd) throws InterruptedException{
		SigninPage signin=new SigninPage();
		sendText(signin.username, uid);
		sendText(signin.password, pwd);
			
		click(signin.loginBtn);
		
	}
	
	@DataProvider
	public Object[][] getData(){
		return ExcelUtility.excelIntoArray(Constants.XL_DATA_FILEPATH, "Login");
	}
	
	
}
