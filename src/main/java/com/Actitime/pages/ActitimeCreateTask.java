package com.Actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeCreateTask 
{
	@FindBy(xpath="//div[.='TASKS']")
	private WebElement taskLInk;
	
	@FindBy(xpath="//div[.='Add New Task']")
	private WebElement newTaskButton;
	
	@FindBy(xpath="//div[.='Create new tasks']")
	private WebElement createNewTask;
	
	@FindBy(xpath=".//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")
	private WebElement taskname;
	
	@FindBy(xpath="(//button[.='set deadline'])[1]")
	private WebElement deadline;
	
	@FindBy(xpath="//span[.='17']")
	private WebElement date;
	
	@FindBy(xpath="(//button[.='Non-Billable'])[1]")
	private WebElement typeOfWork;
	
	@FindBy(xpath="//a[.='amar']")
	private WebElement amar;
	
	@FindBy(xpath="(//input[@type='checkbox'])[3]")
	private WebElement checkbox;
	
	@FindBy(xpath="//span[.='Create Tasks']")
	private WebElement tasksave;
	
	public ActitimeCreateTask(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createTask(String taskName) throws InterruptedException
	{
		taskLInk.click();
		Thread.sleep(3000);
		newTaskButton.click();
		Thread.sleep(3000);
		createNewTask.click();
		Thread.sleep(3000);
		taskname.sendKeys(taskName);
		Thread.sleep(3000);
		deadline.click();
		Thread.sleep(3000);
		date.click();
		Thread.sleep(3000);
		typeOfWork.click();
		Thread.sleep(3000);
		amar.click();
		Thread.sleep(3000);
		checkbox.click();
		Thread.sleep(3000);
		tasksave.click();
	}
}
