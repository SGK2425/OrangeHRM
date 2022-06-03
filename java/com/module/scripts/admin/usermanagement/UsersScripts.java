package com.module.scripts.admin.usermanagement;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.module.objects.homepage.LoginLogoutpageObject;
import com.module.utills.admin.usermanagement.UserspageUtills;
import com.module.utills.homepage.LoginLogoutpageUtills;


public class UsersScripts extends BaseClass {
	
	UserspageUtills userspageUtills;
	LoginLogoutpageObject loginLogoutpageObject;
	LoginLogoutpageUtills loginLogoutpageUtills;
	
	@BeforeClass
	
	public void load() {
		
		userspageUtills=PageFactory.initElements(driver,UserspageUtills.class);
		loginLogoutpageObject=PageFactory.initElements(driver,LoginLogoutpageObject.class);	
		loginLogoutpageUtills=PageFactory.initElements(driver, LoginLogoutpageUtills.class);
	}
	
	@Test
	public void logindetails() {
		loginLogoutpageUtills.applicationURL("Admin","admin123");
		userspageUtills.enterUserName("yedu");
		userspageUtills.selectUserRole();
		userspageUtills.selectUserAdmin();
		userspageUtills.enterEmployeeName("yedukondaluNarsing");
		userspageUtills.seclectstatus();
		userspageUtills.enterEnabled("enabled");
		
	}
	

}
