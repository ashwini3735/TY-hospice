package com.admin;

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
import org.openqa.selenium.support.PageFactory;

import com.hms.GenricUtils.ExcelUtilite;
import com.hms.GenricUtils.FileUtiles;
import com.hms.GenricUtils.WebDriverUtils;
import com.hms.GenricUtils.javaUtiles;
import com.objectRepository.AdminDashboardpage;
import com.objectRepository.AdminLoginpage;
import com.objectRepository.Editdoctordetalespage;
import com.objectRepository.Homepage;
import com.objectRepository.managedoctorpage;

public class Admineditthedoctor {
	public static void main(String[] args) throws IOException {
		
		// create object for all genric utility classes
		javaUtiles jLib = new javaUtiles();
		ExcelUtilite eLib = new ExcelUtilite();
		FileUtiles FLib = new FileUtiles();
		WebDriverUtils WLib = new WebDriverUtils();
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
	        
	      
	        // click on total Doctor count link
	    AdminDashboardpage adp = new AdminDashboardpage(driver);
	    		adp.getTotalDoctorcount().click();
	   ;
	   
	        //click on edit icon
	    		managedoctorpage mp = new managedoctorpage(driver);
	    	mp.getEditicon().click();
	     
	     
	    String fees =  eLib.ReadDataFromExel("Doctorfee", 0, 1);
	    
			// click on update
		Editdoctordetalespage edp = new Editdoctordetalespage(driver);
		edp.getConcenyfee().clear();
		edp.getConcenyfee().sendKeys(fees);
		edp.getUpdatbutton().click();
		
			
			// click on mange doctor
		   adp.getDoctormajortab().click();
		   adp.getManagedoctortab().click();
			
			mp.getEditicon().click();
			// verify the updatet fee
		String edittedfee=	driver.findElement(By.name("docfees")).getAttribute("value");
		System.out.println(edittedfee);
		
	  if(edittedfee.equals(fees))
		{
				
		System.out.println("updatted profile");
	}
	  else
	  {
		  System.out.println("not updatted");
	  }
	 
	}

}
