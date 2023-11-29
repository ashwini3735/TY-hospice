package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPatientpage {
	
	@FindBy(xpath="//button[@name='submit']")
	private WebElement Addbutton;
	
	@FindBy(xpath="//i[@class='ti-angle-down']")
	private WebElement MyprofileDropDown;
	
	@FindBy(xpath="//a[contains(text(),'Profile')]")
	private WebElement Myprofileicon;
	 
	@FindBy(xpath="//a[contains(text(),'Password')]")
	private WebElement ChangePasswordbutton;
	
	@FindBy(xpath="//a[contains(text(),'Log')]")
	private WebElement logoutbutton;
	 
	
	public  AddPatientpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddbutton() {
		return Addbutton;
	}

	public WebElement getMyprofileDropDown() {
		return MyprofileDropDown;
	}

	public WebElement getMyprofileicon() {
		return Myprofileicon;
	}

	public WebElement getChangePasswordbutton() {
		return ChangePasswordbutton;
	}

	public WebElement getLogoutbutton() {
		return logoutbutton;
	}

	
}
