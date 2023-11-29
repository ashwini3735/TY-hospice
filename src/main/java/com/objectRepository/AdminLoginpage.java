package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLoginpage {
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement usernameTF;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordTF;
	
	@FindBy(xpath="//button[@name='submit']")
	private WebElement loginbutton;
	
	public  AdminLoginpage(WebDriver driver)
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
	//bessness logic
	

	public void Clic_Loginbutton() 
	{
		loginbutton.click();
	}
	

}
