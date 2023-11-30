package com.user;

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

import com.hms.GenricUtils.ExcelUtilite;
import com.hms.GenricUtils.FileUtiles;
import com.hms.GenricUtils.IPathConstants;
import com.hms.GenricUtils.WebDriverUtils;
import com.hms.GenricUtils.javaUtiles;
import com.objectRepository.AddPatientpage;
import com.objectRepository.Homepage;
import com.objectRepository.UserDashBoardpage;
import com.objectRepository.UserLoginpage;
import com.objectRepository.bookappointmentpage;

public class patientbookappointment {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		// create object for all genric utility classes
				javaUtiles jLib = new javaUtiles();
				ExcelUtilite eLib = new ExcelUtilite();
				FileUtiles FLib = new FileUtiles();
				WebDriverUtils WLib = new WebDriverUtils();
				
				
				String URL	= FLib.readdatafrompropertyfile("url");
				String UN	= FLib.readdatafrompropertyfile("usernameuser");
				String PWD	= FLib.readdatafrompropertyfile("passworduser");
		
				
				
	        WebDriver driver =new  ChromeDriver();
	        WLib.maximizewindow(driver);
	        WLib.waitforPageLoad(driver, 5);
	       
	        
	        //login as patient
	        driver.get(URL);
	        Homepage hp = new Homepage(driver);
	       hp.click_UserLink();
	     UserLoginpage ulp = new  UserLoginpage(driver);
	     ulp.getUsernameTF().sendKeys(UN);
	     ulp.getPasswordTF().sendKeys(PWD);
	     ulp.Clic_Loginbutton();
	       
	     UserDashBoardpage udp  = new  UserDashBoardpage(driver);
	     udp.Click_UserBookAppointmentLink();
	     
	       	        
	        WebElement spl = driver.findElement(By.name("Doctorspecialization"));
			spl.click();
			WLib.dropdownbytext(spl,"Dentist" );
			
	        WebElement Dn = driver.findElement(By.name("doctor"));
	        WLib.dropdownbytext(Dn,"Poojita" );
	       
	        
	       
	        //enter all valuse to TF
	        eLib.readmultipledata("Apointdata", driver);
	 
	        
	        bookappointmentpage bap = new bookappointmentpage(driver);
			bap.getSelectdatedropdown().click();
			bap.getSelectdate().click();
			bap.getTimedropdown().click();
			bap.getSelethuor().click();
			bap.getSeletminute().click();
			bap.getSeletam();
			

			Thread.sleep(5000);
			bap.getsubmitbutton().click();
		//	Thread.sleep(5000);
			// click on ok popup
			String text=	driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
			// click on logout
			// click on my profile icon
			AddPatientpage lb = new AddPatientpage(driver);
			lb.getMyprofileDropDown().click();
			lb.getLogoutbutton().click();
				
						// again login and verify
				        //login as patient
			
				        driver.get(URL);
				        hp.click_UserLink();
				        ulp.getUsernameTF().sendKeys(UN);
					     ulp.getPasswordTF().sendKeys(PWD);
					     ulp.Clic_Loginbutton();
				        
	}

}
