package com.Actitime.scripts;

import org.testng.annotations.Test;

import com.Actitime.generics.AutoConstant;
import com.Actitime.generics.BaseTest;
import com.Actitime.generics.ExcelLibrary;



public class ActitimeCreateCustomer extends BaseTest implements AutoConstant
{
	@Test
	public void createCus() throws InterruptedException
	{
		String un=ExcelLibrary.getCellValue(AutoConstant.path, "Sheet2", 0, 0);
		String pass=ExcelLibrary.getCellValue(AutoConstant.path, "Sheet2", 1, 0);
		
		com.Actitime.pages.ActitimeLogin log=new com.Actitime.pages.ActitimeLogin(driver);
		log.login(un, pass);
		
		Thread.sleep(5000);
		
		String cusName=ExcelLibrary.getCellValue(AutoConstant.path, "Sheet2", 2, 0);
		
		com.Actitime.pages.ActitimeCreateCustomer act=new com.Actitime.pages.ActitimeCreateCustomer(driver);
		act.createCustomerMethod(cusName);
		
		Thread.sleep(5000);
		
		com.Actitime.pages.ActitimeLogout logout=new com.Actitime.pages.ActitimeLogout(driver);
		logout.logout();
		
		
	}
	
}
