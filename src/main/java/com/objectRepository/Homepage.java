package com.objectRepository;

import java.util.HashMap;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hms.GenricUtils.javaUtiles;

public class Homepage {
	
	@FindBy(xpath="(//div[@class='listview_1_of_3 images_1_of_3']/descendant::a[text()='Click Here'])[3]")
	private WebElement AdminLink;
	
	@FindBy(xpath="(//div[@class='listview_1_of_3 images_1_of_3']/descendant::a[text()='Click Here'])[2]")
	private WebElement DoctorLink;
	
	@FindBy(xpath="(//div[@class='listview_1_of_3 images_1_of_3']/descendant::a[text()='Click Here'])[1]")
	private WebElement UserLink;
	
	//initaializaion
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilizaion
	public WebElement getAdminLink() {
		return AdminLink;
	}

	public WebElement getDoctorLink() {
		return DoctorLink;
	}

	public WebElement getUserLink() {
		return UserLink;
	}
	//bussiness logic
	public void click_AdminLink()
	{
		AdminLink.click();
	}
	public void click_DoctorLink()
	{
		DoctorLink.click();
	}
	public void click_UserLink()
	{
		UserLink.click();
	}
	
	
	
	public void homp(HashMap<String, String> map,WebDriver driver,javaUtiles jLib)
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
	   }
	   }}}
		   
			   
		   

	   
	
	


