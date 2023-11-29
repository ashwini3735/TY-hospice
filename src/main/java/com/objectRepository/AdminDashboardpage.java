package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminDashboardpage {
	@FindBy(xpath="//a[contains(text(),'Doctors')]")
	private WebElement TotalDoctorcount;
	
	@FindBy(xpath="(//span[contains(text(),'Doctors')])[1]")
      private WebElement Doctormajortab;
	
	@FindBy(xpath="//a[@href='add-doctor.php']")
	private WebElement adddoctortab;
	
	





	@FindBy(xpath="(//ul[@class='sub-menu']/li/a/span[contains(text(),'Manage')])[1]")
	private WebElement managedoctortab;
	
	public  AdminDashboardpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getAdddoctortab() {
		return adddoctortab;
	}

	
	public WebElement getDoctormajortab() {
		return Doctormajortab;
	}


	public WebElement getManagedoctortab() {
		return managedoctortab;
	}

	

	

	public WebElement getTotalDoctorcount() {
		return TotalDoctorcount;
	}
	
	

}