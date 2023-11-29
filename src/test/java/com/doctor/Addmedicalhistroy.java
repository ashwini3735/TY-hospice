package com.doctor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.hms.GenricUtils.ExcelUtilite;
import com.hms.GenricUtils.FileUtiles;
import com.hms.GenricUtils.WebDriverUtils;
import com.hms.GenricUtils.javaUtiles;
import com.objectRepository.AddPatientpage;
import com.objectRepository.DoctorDashboardpage;
import com.objectRepository.Doctorloginpage;
import com.objectRepository.Homepage;
import com.objectRepository.UserLoginpage;
import com.objectRepository.managepatientpage;

public class Addmedicalhistroy {
	public static void main(String[] args) throws IOException {
		
		// create object for all genric utility classes
		javaUtiles jLib = new javaUtiles();
		ExcelUtilite eLib = new ExcelUtilite();
		FileUtiles FLib = new FileUtiles();
		WebDriverUtils WLib = new WebDriverUtils();
		 
		// get the data from propertes file
	String URL	= FLib.readdatafrompropertyfile("url");
	String UN	= FLib.readdatafrompropertyfile("usernamedoctor");
	String PWD	= FLib.readdatafrompropertyfile("passworddoctor");
	        
	       // Ccreate webdriver
	        WebDriver driver =new  ChromeDriver();
	        //maximize window
	        WLib.maximizewindow(driver);
	        //pageLoad
	        
	        WLib.waitforPageLoad(driver, 5);
	        
	        // login as doctor
	        
	        driver.get(URL);
	        Homepage hp = new Homepage(driver);
	        hp.click_DoctorLink();
	        Doctorloginpage dlp = new Doctorloginpage(driver);
	        dlp.getUsernameTF().sendKeys(UN);
	        dlp.getPasswordTF().sendKeys(PWD);
	        dlp.Clic_Loginbutton();
	     
	        // click on pahient 
	        DoctorDashboardpage ddp = new DoctorDashboardpage(driver);
	        ddp.Click_patientmajiortab();
	        ddp.Click_MannagePatientTab();
	        
	      
	        
	        // to add medicl list click on perticular patient eye icon
	        driver.findElement(By.xpath("//table/tbody/tr/td[@class='hidden-xs' and text()='Ashwini']/ancestor::tr/descendant::td/a/i[@class='fa fa-eye']")).click();
	         // click on add medical history button
	        driver.findElement(By.xpath("//button[text()='Add Medical History']")).click();
	        
	         
	        // add medical histroy data
	       
	        eLib.readmultipledata("medicalHistrorydata", driver);
	        managepatientpage mp = new managepatientpage(driver);
	        mp.Click_submitbutton();
			 
			
		//String text=	driver.switchTo().alert().getText();
		//System.out.println(text);
		String text= WLib.Handlealartpopuptext(driver);
		WLib.Handlealartpopupaccept(driver);
		System.out.println(text);
		//logout as doctor
		AddPatientpage lb = new AddPatientpage(driver);
		lb.getMyprofileDropDown().click();
		lb.getLogoutbutton().click();
		
		
	
		//click on patient link
		hp.click_UserLink();
		UserLoginpage up = new UserLoginpage(driver);
		up.getUsernameTF().sendKeys("Abhi@123");
		up.getPasswordTF().sendKeys("12345678");
	
	      up.Clic_Loginbutton();
		
		
			 
		 
	}

}
