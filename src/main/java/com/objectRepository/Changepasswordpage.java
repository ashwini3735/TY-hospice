package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Changepasswordpage {
	@FindBy(name="cpass")
	private WebElement currentpasword;
	
	@FindBy(name="npass")
	private WebElement newpasword;
	
	@FindBy(name="cfpass")
	private WebElement conforpasword;
	
	@FindBy(name="submit")
	private WebElement submitbutton;
	
	

	public Changepasswordpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCurrentpasword() {
		return currentpasword;
	}

	public WebElement getNewpasword() {
		return newpasword;
	}

	public WebElement getConforpasword() {
		return conforpasword;
	}
	public WebElement getSubmitbutton() {
		return submitbutton;
	}

}
