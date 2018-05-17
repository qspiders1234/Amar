package com.Actitime.scripts;

import org.testng.annotations.Test;

import com.Actitime.generics.AutoConstant;
import com.Actitime.generics.BaseTest;
import com.Actitime.generics.ExcelLibrary;


public class ActitimeLogin extends BaseTest implements AutoConstant
{
	@Test
	public void loginin() throws InterruptedException
	{
	String un=ExcelLibrary.getCellValue(AutoConstant.path, "Sheet2", 0, 0);
	String pass=ExcelLibrary.getCellValue(AutoConstant.path, "Sheet2", 1, 0);
	
	com.Actitime.pages.ActitimeLogin log=new com.Actitime.pages.ActitimeLogin(driver);
	log.login(un, pass);
	
	}
	
}
