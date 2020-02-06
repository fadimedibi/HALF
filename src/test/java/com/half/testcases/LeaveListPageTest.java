package com.half.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.half.pages.DashBoardPageElements;
import com.half.pages.LeaveListPageElements;
import com.half.pages.SigninPageElements;
import com.half.utils.CommonMethods;
import com.half.utils.ConfigsReader;
import com.half.utils.Constants;

public class LeaveListPageTest extends CommonMethods {

	@Test(groups = "regression")
	public void leaveLabelValidation() {
		ConfigsReader.readProperties(Constants.CREDENTIALS_FILEPATH);
		SigninPageElements signin = new SigninPageElements();
		DashBoardPageElements dash = new DashBoardPageElements();
		LeaveListPageElements leaveList = new LeaveListPageElements();

//		sendText(signin.username, "Admin");
//		sendText(signin.password, "Syntax@123");
//		click(signin.loginBtn);

		// instead of using all these steps we can use login() method we created in
		// SiginPageElements class

		signin.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));

		click(dash.leaveLnk);
		click(dash.leaveList);

		Assert.assertTrue(leaveList.leaveListLbl.isDisplayed(), "Label is not displayed");

	}

	@Test(groups = "regression")
	public void leaveLabelValidation1() {

		SigninPageElements signin = new SigninPageElements();
		DashBoardPageElements dash = new DashBoardPageElements();
		LeaveListPageElements leaveList = new LeaveListPageElements();

		signin.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		dash.navigateToLeaveList();
		Assert.assertTrue(leaveList.leaveListLbl.isDisplayed(), "Label is not displayed");

	}

}
