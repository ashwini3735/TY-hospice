package com.objectRepository;

import java.util.HashMap;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddDoctorpage {
	@FindBy(name="Doctorspecialization")
	private WebElement Doctorspecization;
	
	@FindBy(name="submit")
	private WebElement submitbutton;
	
	public WebElement getSubmitbutton() {
		return submitbutton;
	}

	public AddDoctorpage(WebDriver driver)

	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getDoctorspecization() {
		return Doctorspecization;
	}
	/*public void enteralldoctordetailes(WebDriver driver,HashMap<String, String> hmap,)
	{
     for(Entry<String, String> data : hmap.entrySet())
     {
    	 driver.findElement(By.name(data.getkey())).sendkeys(data.getValue());
     }
     dropdownbytext(Doctorspecization,Doctorspecization);
	}*/
}
