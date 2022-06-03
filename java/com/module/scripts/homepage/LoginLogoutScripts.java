package com.module.scripts.homepage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.utills.homepage.LoginLogoutpageUtills;

public class LoginLogoutScripts extends BaseClass{
	
	LoginLogoutpageUtills loginLogoutpageUtills;
	
	@BeforeClass
	
	public void load() {
		loginLogoutpageUtills=PageFactory.initElements(driver, LoginLogoutpageUtills.class);
		
	}
	
	@Test
	public void logindetails() {
		loginLogoutpageUtills.applicationURL("Admin","admin123");
		loginLogoutpageUtills.clickOnAdmin();
		loginLogoutpageUtills.clickOnUsrmanagement();
		loginLogoutpageUtills.clickOnUser();
	}
	
	

}
