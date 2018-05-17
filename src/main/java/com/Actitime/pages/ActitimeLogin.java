package com.Actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLogin 
{
	//declaration
	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement loginLink;
	
	//initialization
	public ActitimeLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//utililzation
	public void login(String un, String pass) throws InterruptedException
	{
		user.sendKeys(un);
		Thread.sleep(3000);
		
		password.sendKeys(pass);
		Thread.sleep(3000);
		
		loginLink.click();
	}
	
}
