package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class managepatientpage {
	@FindBy(xpath="//button[text()='Add Medical History']")
	private WebElement AddmedicalHistory;
	
			@FindBy(xpath="//button[@class='btn btn-primary']")
			private WebElement submitbutton;
			
			@FindBy(xpath="//button[@class='btn btn-secondary']")
			private WebElement closebutton;

			public managepatientpage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}

			public WebElement getAddmedicalHistory() {
				return AddmedicalHistory;
			}

			
			public WebElement getSubmitbutton() {
				return submitbutton;
			}

			

			public WebElement getClosebutton() {
				return closebutton;
			}

			
			//bussnes logic
			public void Click_AddmedicalHistory()
			{
				AddmedicalHistory.click();
			}
			public void Click_submitbutton()
			{
				submitbutton.click();
			}
			public void Click_closebutton()
			{
				closebutton.click();
			}
}
