package com.clm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.clm.qa.base.TestBase;

public class WorkToDoPage extends  TestBase
{
	@FindBy(xpath ="//span[normalize-space()='Contracts']")
	WebElement contract;

	@FindBy(xpath = "//div[text ()=' Calendar ']")
	WebElement selectCalendar;
	
	@FindBy(xpath ="//button[text ()='More']")
	WebElement More;
	
	@FindBy(xpath ="//span[text ()='Adhoc Alerts']")
	WebElement adhocAlert;
	
	//@FindBy(xpath ="xpath")
	
}
