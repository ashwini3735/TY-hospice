package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookappointmentpage {
	@FindBy(xpath="//button[@name='submit']")
	private WebElement submitbutton;
	
	@FindBy(name="appdate")
	private WebElement Selectdatedropdown;
	
	@FindBy(xpath="//table/tbody/tr/td[text()='27']")
	private WebElement selectdate;
	
	@FindBy(xpath="//input[@name='apptime']")
	private WebElement timedropdown;
	
	@FindBy(xpath="//a[@data-action='incrementHour']")
	private WebElement selethuor;
	@FindBy(xpath="//a[@data-action='incrementMinute']")
	private WebElement seletminute;
	@FindBy(xpath="(//a[@data-action='toggleMeridian'])[1])")
	private WebElement seletam;
	public bookappointmentpage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getsubmitbutton() {
		return submitbutton;
	}
	public WebElement getSelectdatedropdown() {
		return Selectdatedropdown;
	}
	public WebElement getSelectdate() {
		return selectdate;
	}
	public WebElement getTimedropdown() {
		return timedropdown;
	}
	public WebElement getSelethuor() {
		return selethuor;
	}
	public WebElement getSeletminute() {
		return seletminute;
	}
	public WebElement getSeletam() {
		return seletam;
	}

}
