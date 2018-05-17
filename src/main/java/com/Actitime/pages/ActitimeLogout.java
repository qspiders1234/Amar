package com.Actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLogout 
{
	@FindBy(id="logoutLink")
	private WebElement logoutButton;
	
	public ActitimeLogout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logout()
	{
		logoutButton.click();
	}
}
