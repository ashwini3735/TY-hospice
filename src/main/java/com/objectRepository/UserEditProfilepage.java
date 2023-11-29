package com.objectRepository;

import java.util.HashMap;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hms.GenricUtils.javaUtiles;

public class UserEditProfilepage {
	
	@FindBy(name="fname")
	private WebElement nameTF;
	
	@FindBy(xpath="//button[@name='submit']")
	private WebElement SubmitButton;
	
	public UserEditProfilepage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}
	public void useredit(HashMap<String, String> map,WebDriver driver,javaUtiles jLib)
	{
	 for (Entry<String, String> data: map.entrySet()) 
	   {     
		 
	   if(data.getKey().contains(null))
	   {
			   driver.findElement(By.name(data.getKey())).sendKeys(data.getValue()+jLib.getRandomNo());
			   
	   }
	   else 
	   {
		   driver.findElement(By.name(data.getKey())).sendKeys(data.getValue());
	   }}}
	//bussenes logic
	public void Click_SubmitButton()
	{
		SubmitButton.click();
	}
	public void UserEditProfile(String Edit )
	{
		
	}

}
