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
import org.testng.annotations.Test;

import com.hms.GenricUtils.ExcelUtilite;
import com.hms.GenricUtils.FileUtiles;
import com.hms.GenricUtils.IPathConstants;
import com.hms.GenricUtils.WebDriverUtils;
import com.hms.GenricUtils.javaUtiles;
import com.objectRepository.AddPatientpage;
import com.objectRepository.AdminLoginpage;
import com.objectRepository.Homepage;
import com.objectRepository.UserDashBoardpage;
import com.objectRepository.UserEditProfilepage;
import com.objectRepository.UserLoginpage;

public class patientupdateprofile_test {
	
	@Test
	public void test1() throws IOException {
		
		// create object for all genric utility classes
		javaUtiles jLib = new javaUtiles();
		ExcelUtilite eLib = new ExcelUtilite();
		FileUtiles FLib = new FileUtiles();
		WebDriverUtils WLib = new WebDriverUtils();
		
		//FLib.readdatafrompropertyfile(IPathConstants.FilePath);
		String URL	= FLib.readdatafrompropertyfile("url");
		String UN	= FLib.readdatafrompropertyfile("usernameuser");
		String PWD	= FLib.readdatafrompropertyfile("passworduser");

         WebDriver driver =new  ChromeDriver();
         System.out.println("--browserlanuhed---");
        WLib.maximizewindow(driver);
        System.out.println("---url---");
            //login as patient
           driver.get(URL);
           //wait for
           WLib.waitforPageLoad(driver, 5);
           
	        Homepage hp = new Homepage(driver);
	        hp.click_UserLink();
	        
	       UserLoginpage loginpage = new UserLoginpage(driver);  
	       loginpage.getUsernameTF().sendKeys(UN);
	       loginpage.getPasswordTF().sendKeys(PWD);
	       loginpage.Clic_Loginbutton();
	       
	        // click on petint edit profile
	       UserDashBoardpage ub = new UserDashBoardpage(driver);
	       ub.Click_UserUpdateProfilelink();
	       
	        // enter the data to edit the patient profile
	      eLib.readmultipledata("patientdata", driver);
	      
			//click on update button
	        UserEditProfilepage up = new UserEditProfilepage(driver);
	       
	        up.Click_SubmitButton();
			
		String text=	driver.findElement(By.xpath("//h5[@style='color: green; font-size:18px; ']")).getText();
		System.out.println(text);
			// click on my profile icon
		AddPatientpage lb = new AddPatientpage(driver);
		lb.getMyprofileDropDown().click();
		lb.getChangePasswordbutton().click();	
			// again login and verif
	        //login as patient
	        driver.get(URL);
	        hp.click_UserLink();
		       loginpage.getUsernameTF().sendKeys(UN);
		       loginpage.getPasswordTF().sendKeys(PWD);
		       loginpage.Clic_Loginbutton();
	       
			
				
			
	        
	        
		
	}

}
