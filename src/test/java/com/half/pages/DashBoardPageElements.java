package com.half.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.half.testbase.BaseClass;
import com.half.utils.CommonMethods;

public class DashBoardPageElements extends CommonMethods {
	
	@FindBy(linkText="Leave")
	public WebElement leaveLnk;
	
	@FindBy(linkText="Leave List")
	public WebElement leaveList;
	
	@FindBy(id="menu_pim_viewPimModule")
	public WebElement pim;
	
	@FindBy(id="menu_pim_addEmployee")
	public WebElement addEmp;
	
	

	public DashBoardPageElements() {
		PageFactory.initElements(BaseClass.driver,this);
	}
	
	/**
	 * this method will navigate to leave list page
	 */
	public void navigateToLeaveList() {
		jsClick(leaveLnk);
		jsClick(leaveList);
	}
	/**
	 * This method will navigate to add Employee page
	 */
	public void navigateToAddEmployee() {
		jsClick(pim);
		jsClick(addEmp);
	}
	
	
}
