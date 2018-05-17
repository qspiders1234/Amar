package com.Actitime.scripts;

import org.testng.annotations.Test;

import com.Actitime.generics.AutoConstant;
import com.Actitime.generics.BaseTest;
import com.Actitime.generics.ExcelLibrary;



public class ActitimeCreateTask extends BaseTest implements AutoConstant
{
	@Test
	public void task() throws InterruptedException
	{
		
		String un=ExcelLibrary.getCellValue(AutoConstant.path, "Sheet2", 0, 0);
		String pass=ExcelLibrary.getCellValue(AutoConstant.path, "Sheet2", 1, 0);
		
		com.Actitime.pages.ActitimeLogin log=new com.Actitime.pages.ActitimeLogin(driver);
		log.login(un, pass);
		
		Thread.sleep(5000);
		
		String taskName=ExcelLibrary.getCellValue(AutoConstant.path, "Sheet2",5,0);
		
		com.Actitime.pages.ActitimeCreateTask task=new com.Actitime.pages.ActitimeCreateTask(driver);
		task.createTask(taskName);
		
		Thread.sleep(5000);
		
		com.Actitime.pages.ActitimeLogout logout=new com.Actitime.pages.ActitimeLogout(driver);
		logout.logout();
		
	}
}
