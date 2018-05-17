package com.Actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeCreateCustomer 
{
	@FindBy(xpath="//div[.='TASKS']")
	private WebElement taskLInk;
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addNewLInk;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newCustomerLink;
	
	@FindBy(id="customerLightBox_nameField")
	private WebElement customerName;
	
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement describeBox;
	
	@FindBy(xpath="//button[@id='ext-gen23']")
	private WebElement existingCus;
	
	@FindBy(xpath="//a[.='Our Company']")
	private WebElement ourCompanycus;
	
	@FindBy(xpath="//span[.='Create Customer']")
	private WebElement createNewButton;
	
	
	public ActitimeCreateCustomer(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createCustomerMethod(String cusName) throws InterruptedException
	{
		taskLInk.click();
		Thread.sleep(3000);
		addNewLInk.click();
		Thread.sleep(3000);
		newCustomerLink.click();
		Thread.sleep(3000);
		customerName.sendKeys(cusName);
		Thread.sleep(3000);
		describeBox.sendKeys("ITS A NEW CUSTOMER");
		Thread.sleep(3000);
		existingCus.click();
		Thread.sleep(3000);
		ourCompanycus.click();
		Thread.sleep(3000);
		createNewButton.click();
		
	}
}
