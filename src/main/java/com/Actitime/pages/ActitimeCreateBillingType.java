package com.Actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeCreateBillingType 
{
	@FindBy(xpath="//div[@class='popup_menu_icon settings_icon']")
	private WebElement settinglink;
	
	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement typeOfWork;
	
	@FindBy(xpath="//span[.='Create Type of Work']")
	private WebElement createWork;
	
	@FindBy(xpath=".//*[@id='name']")
	private WebElement taskname;
	
	@FindBy(xpath="//select[@name='active']")
	private WebElement status;
	
	@FindBy(id="billingType_setBillable")
	private WebElement billingType;
	
	@FindBy(xpath="//input[@value='   Create Type of Work   ']")
	private WebElement saveBillingTask;
	
	public ActitimeCreateBillingType(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void bilingtask(String billName) throws InterruptedException
	{
		settinglink.click();
		Thread.sleep(3000);
		typeOfWork.click();
		Thread.sleep(3000);
		createWork.click();
		Thread.sleep(3000);
		taskname.sendKeys(billName);
		Thread.sleep(3000);
		status.click();
		Thread.sleep(3000);
		billingType.click();
		Thread.sleep(3000);
		saveBillingTask.click();
	}
}
