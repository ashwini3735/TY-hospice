package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorDashboardpage {
	
	@FindBy(xpath="//a[contains(text(),'Update')]")
	private WebElement UserUpdateProfilelink;
	
	@FindBy(xpath="//a[contains(text(),'History')]")
	private WebElement UserAppointmentHistorylink;
	
	@FindBy(xpath="//div/span[contains(text(),'History')]")
	private WebElement viwappointmentmajortab;
	
	@FindBy(xpath="//div/span[contains(text(),'Patients')]")
	private WebElement patientmajiortab;
	
	@FindBy(xpath="//span[contains(text(),'Add')]")
	private WebElement Addpatientstab;
	
	@FindBy(xpath="//span[contains(text(),'Manage')]")
	private WebElement MannagePatientTab;
	
	@FindBy(xpath="//span[contains(text(),'Search')]")
	private WebElement Surchicon;
	
	public DoctorDashboardpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getUserUpdateProfilelink() {
		return UserUpdateProfilelink;
	}

	public WebElement getUserAppointmentHistorylink() {
		return UserAppointmentHistorylink;
	}

	public WebElement getViwappointmentmajortab() {
		return viwappointmentmajortab;
	}

	public WebElement getPatientmajiortab() {
		return patientmajiortab;
	}

	public WebElement getAddpatientstab() {
		return Addpatientstab;
	}

	public WebElement getMannagePatientTab() {
		return MannagePatientTab;
	}

	public WebElement getSurchicon() {
		return Surchicon;
	}
	//bussness logic
	public void Click_UserUpdateProfilelink() {
		 UserUpdateProfilelink.click();
	}
	public void Click_UserAppointmentHistorylink() {
		UserAppointmentHistorylink.click();
	}
	public void Click_viwappointmentmajortab() {
		viwappointmentmajortab.click();
	}
	public void Click_patientmajiortab() {
		patientmajiortab.click();
	}
	public void Click_Addpatientstab() {
		Addpatientstab.click();
	}
	public void Click_MannagePatientTab()
	{
		MannagePatientTab.click();
	}
	public void Click_Surchicon()
	{
		Surchicon.click();
	}
	
}
