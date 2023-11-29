package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class managedoctorpage {
	@FindBy(xpath="//table/tbody/tr/td[text()='Poojita']/../descendant::a[@tooltip='Edit']")
	private WebElement editicon;
	
	public  managedoctorpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getEditicon() {
		return editicon;
	}

}
