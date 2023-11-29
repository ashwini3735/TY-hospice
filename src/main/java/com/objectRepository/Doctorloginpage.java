package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Doctorloginpage {
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement usernameTF;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordTF;
	
	@FindBy(xpath="//button[@name='submit']")
	private WebElement loginbutton;
	
	public Doctorloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsernameTF() {
		return usernameTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	//bussness logic
	public void sendkey_usernameTF()
	{
		usernameTF.sendKeys("usernamedoctor");
	}
	public void sendkey_passwordTF()
	{
		passwordTF.sendKeys("passworddoctor");
	}

	public void Clic_Loginbutton() 
	{
		loginbutton.click();
	}

}
