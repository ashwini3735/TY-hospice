package com.doctor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.hms.GenricUtils.BaseClass;
import com.hms.GenricUtils.ExcelUtilite;
import com.hms.GenricUtils.FileUtiles;
import com.hms.GenricUtils.IPathConstants;
import com.hms.GenricUtils.WebDriverUtils;
import com.hms.GenricUtils.javaUtiles;
import com.objectRepository.AddPatientpage;
import com.objectRepository.AdminLoginpage;
import com.objectRepository.Changepasswordpage;
import com.objectRepository.Homepage;
//@Listeners(com.hms.GenricUtils.LisimpClass.class)
public class admincanchangepasword extends BaseClass {
	
		
	/*	// create object for all genric utility classes
				javaUtiles jLib = new javaUtiles();
				ExcelUtilite eLib = new ExcelUtilite();
				FileUtiles FLib = new FileUtiles();
				WebDriverUtils WLib = new WebDriverUtils();
				FLib.readdatafrompropertyfile(IPathConstants.FilePath);
				
				String URL	= FLib.readdatafrompropertyfile("url");
				String UN	= FLib.readdatafrompropertyfile("usernameadmin");
				String PWD	= FLib.readdatafrompropertyfile("passwordadmin");*/
     
		
	        
	       // Ccreate webdriver
	  /*      WebDriver driver =new  ChromeDriver();
	        WLib.maximizewindow(driver);
	      WLib.waitforPageLoad(driver, 5);
	       
	      driver.get(URL);
	        //login as admin
	   Homepage hp = new Homepage(driver);
	   hp.click_AdminLink();
	AdminLoginpage al = new AdminLoginpage(driver);
	al.getUsernameTF().sendKeys(UN);
	al.getPasswordTF().sendKeys(PWD);
	al.Clic_Loginbutton();*/
	
      @Test()
      public void Test1() {
    	  
    	 // Assert.fail();
	AddPatientpage lb = new AddPatientpage(driver);
	lb.getMyprofileDropDown().click();
	
	lb.getChangePasswordbutton().click();
	System.out.println("clickingonchangepassword");
	    Changepasswordpage cp = new Changepasswordpage(driver);
	    cp.getCurrentpasword().sendKeys("Test@12345");
	   
	    cp.getNewpasword().sendKeys("Test@12345");
	    cp.getConforpasword().sendKeys("Test@12345");
	   
	    cp.getSubmitbutton().click();
	  
		String text=	driver.findElement(By.xpath("//p[@style='color:red;']")).getText();
		
		
		System.out.println(text);
	}

}
