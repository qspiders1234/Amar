package com.Actitime.scripts;

import org.testng.annotations.Test;

import com.Actitime.generics.AutoConstant;
import com.Actitime.generics.BaseTest;
import com.Actitime.generics.ExcelLibrary;



public class ActitimeLogout extends BaseTest implements AutoConstant
{
	@Test
	public void logout() throws InterruptedException
	{
		String un=ExcelLibrary.getCellValue(AutoConstant.path, "Sheet2", 0, 0);
		String pass=ExcelLibrary.getCellValue(AutoConstant.path, "Sheet2", 1, 0);
		
		com.Actitime.pages.ActitimeLogin login=new com.Actitime.pages.ActitimeLogin(driver);
		login.login(un, pass);
		
		Thread.sleep(5000);
		
		com.Actitime.pages.ActitimeLogout log=new com.Actitime.pages.ActitimeLogout(driver);
		log.logout();
	}
}
