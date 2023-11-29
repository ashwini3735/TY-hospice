package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Editdoctordetalespage {
	
	@FindBy(name="docfees")
	private WebElement concenyfee;
	



	@FindBy(xpath="//button[@class='btn btn-o btn-primary']")
	private WebElement updatbutton;
	
	
	public  Editdoctordetalespage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getConcenyfee() {
		return concenyfee;
	}
	public WebElement getUpdatbutton() 
	{
		return updatbutton;
	}

}
