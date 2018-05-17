package com.Actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeCreateProject 
{
	@FindBy(xpath="//div[.='TASKS']")
	private WebElement taskbutton;
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addNewLInk;
	
	@FindBy(xpath="//div[.='+ New Project']")
	private WebElement newProjectlink;
	
	@FindBy(id="projectPopup_projectNameField")
	private WebElement projectNameField;
	
	@FindBy(xpath="//button[@id='ext-gen23']")
	private WebElement selectCustname;
	
	@FindBy(xpath="//a[.='Media Agency']")
	private WebElement CustomerType;
	
	@FindBy(xpath="//span[.='Create Project']")
	private WebElement createSave;
	
	public ActitimeCreateProject(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createProjcet(String proName) throws InterruptedException 
	{
		taskbutton.click();
		Thread.sleep(3000);
		addNewLInk.click();
		Thread.sleep(3000);
		newProjectlink.click();
		Thread.sleep(3000);
		projectNameField.sendKeys(proName);
		Thread.sleep(3000);
		selectCustname.click();
		Thread.sleep(3000);
		CustomerType.click();
		Thread.sleep(3000);
		createSave.click();
	}

	
}
