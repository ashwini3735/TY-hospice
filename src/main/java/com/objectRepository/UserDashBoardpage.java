package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDashBoardpage {
	
	@FindBy(xpath="//a[contains(text(),'Update')]")
	private WebElement UserUpdateProfilelink;
	
	@FindBy(xpath="//a[contains(text(),'History')]")
	private WebElement UserAppointmentHistorylink;
	
	@FindBy(xpath="//a[contains(text(),'Book')]")
	private WebElement UserBookAppointmentLink;
	
	@FindBy(xpath="//span[contains(text(),'Medical')]")
	private WebElement MedicalHistoryTab;
	
	
	public UserDashBoardpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserUpdateProfilelink() {
		return UserUpdateProfilelink;
	}

	public WebElement getUserAppointmentHistorylink() {
		return UserAppointmentHistorylink;
	}

	public WebElement getUserBookAppointmentLink() {
		return UserBookAppointmentLink;
	}

	public WebElement getMedicalHistoryTab() {
		return MedicalHistoryTab;
	}
	//busness logic
	public void Click_UserUpdateProfilelink()
	{
		UserUpdateProfilelink.click();
	}
	public void Click_UserAppointmentHistorylink()
	{
		UserAppointmentHistorylink.click();
	}
	public void Click_UserBookAppointmentLink()
	{
		UserBookAppointmentLink.click();
	}
	public void Click_MedicalHistoryTab()
	{
		MedicalHistoryTab.click();
	}
	

}
