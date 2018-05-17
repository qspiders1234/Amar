package com.Actitime.generics;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstant 
{
	public static WebDriver driver;
	
	@BeforeMethod
	public void start()
	{
		//System.setProperty(key, value);
		//driver=new ChromeDriver();
		driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com//");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void end() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
}
