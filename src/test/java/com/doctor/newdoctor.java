package com.doctor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Properties;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.hms.GenricUtils.BaseClass;
import com.hms.GenricUtils.ExcelUtilite;
import com.hms.GenricUtils.FileUtiles;
import com.hms.GenricUtils.IPathConstants;
import com.hms.GenricUtils.WebDriverUtils;
import com.hms.GenricUtils.javaUtiles;
import com.objectRepository.AddDoctorpage;
import com.objectRepository.AddPatientpage;
import com.objectRepository.AdminDashboardpage;
import com.objectRepository.AdminLoginpage;
import com.objectRepository.Doctorloginpage;
import com.objectRepository.Homepage;

public class newdoctor {
//	private static String String;

	public static void main(String[] args) throws IOException {
		
		// create object for all genric utility classes
		javaUtiles jLib = new javaUtiles();
		ExcelUtilite eLib = new ExcelUtilite();
		FileUtiles FLib = new FileUtiles();
		WebDriverUtils WLib = new WebDriverUtils();
		
		FLib.readdatafrompropertyfile(IPathConstants.FilePath);
		String URL	= FLib.readdatafrompropertyfile("url");
		String UN	= FLib.readdatafrompropertyfile("usernameadmin");
		String PWD	= FLib.readdatafrompropertyfile("passwordadmin");
	     
	       // Ccreate webdriver
	        WebDriver driver =new  ChromeDriver();
	        WLib.maximizewindow(driver);
	        WLib.waitforPageLoad(driver, 5);
	       
	        
	        //login as admin
	        driver.get(URL);
	        Homepage hp = new Homepage(driver);
	 	   hp.click_AdminLink();
	 	AdminLoginpage al = new AdminLoginpage(driver);
	 	al.getUsernameTF().sendKeys(UN);
	 	al.getPasswordTF().sendKeys(PWD);
	 	al.Clic_Loginbutton();
	      
	        // click on add doctor
	 AdminDashboardpage adp = new AdminDashboardpage(driver);
	 adp.getDoctormajortab().click();
	 System.out.println("clicking on doctormajortab");
	 
	 adp.getAdddoctortab().click();
	 System.out.println("clicking on adddoctor");
	      
	        //select speslization
	    //  WLib.dropdownbytext(element,"Dentist",);
	 
	        WebElement spl = driver.findElement(By.name("Doctorspecialization"));
	    AddDoctorpage dp = new  AddDoctorpage(driver);
	    //dp.getDoctorspecization();
	        WLib.dropdownbytext(spl,"Dentist");
			
	        eLib.readmultipledata("NewDoctordata", driver) ;
	   
			//click on submit button
	        dp.getSubmitbutton().click();
			//driver.findElement(By.name("submit")).click();
			// click on ok
			String text=	driver.switchTo().alert().getText();
			//System.out.println(text);
			//String text	= WLib.Handlealartpopuptext(driver, String);
			 WLib.Handlealartpopupaccept(driver);
			//WLib.Handlealartpopuptext(driver,String);
			//String text=	driver.switchTo().alert().getText();
			System.out.println( text);
			
		// logout as admin
			AddPatientpage lb = new AddPatientpage(driver);
			lb.getMyprofileDropDown().click();
			lb.getLogoutbutton().click();
			
			// login as new doctor
						hp.click_DoctorLink();
	Doctorloginpage dlp = new	Doctorloginpage(driver);
			
			dlp.getUsernameTF().sendKeys("likhit@gmail.com");
			dlp.getPasswordTF().sendKeys("162021");
			dlp.Clic_Loginbutton();
			
			
	}

}
