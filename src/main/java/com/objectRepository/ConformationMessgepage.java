package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConformationMessgepage {
	
	@FindBy(xpath="//p[@style='color:red;']")
	public WebElement passwordchangedconformationmessg;
	
	public void  ConformationMessgepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getPasswordchangedconformationmessg() {
		return passwordchangedconformationmessg;
	}
	// bussens logic
	
	/*String text= WLib.Handlealartpopuptext(driver);
	WLib.Handlealartpopupaccept(driver);
	System.out.println(text);*/
	
	public void text_getpasswordchangedconformationmessg(WebDriver driver)
	{
	String achual	= passwordchangedconformationmessg.getText();
	String exp= WLib.Handlealartpopuptext(driver);
		 if(achual.equalsIgnoreCase(exp))
		 {
			 System.out.println("added");
		 }
		 else
		 {
			 System.out.println("not added");
		 }
	}
}
