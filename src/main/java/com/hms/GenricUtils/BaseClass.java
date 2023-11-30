package com.hms.GenricUtils;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.objectRepository.AddPatientpage;
import com.objectRepository.AdminLoginpage;
import com.objectRepository.Homepage;

public class BaseClass {
	public DatabaseUtils DLib = new DatabaseUtils();
	public javaUtiles jLib = new javaUtiles();
	public ExcelUtilite eLib = new ExcelUtilite();
	public FileUtiles FLib = new FileUtiles();
	public WebDriverUtils WLib = new WebDriverUtils();
	public WebDriver driver;
	public static WebDriver sdriver;
	
	
	@BeforeSuite(alwaysRun = true)
	public void cofig_DB() throws SQLException
	{
		DLib.connectDB();
		System.out.println("---conncted to database------");
	}
	//@Parameters("BROWSER")
	@BeforeClass(alwaysRun = true)
	public void cofig_BC() throws IOException
	{
	String BROWSER = FLib.readdatafrompropertyfile("browser");
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			System.out.println("browser lunched");
		}
		else if (BROWSER.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("wrong browser");
		}
		//sdriver = driver;
		WLib.maximizewindow(driver);
	}
	@BeforeMethod(alwaysRun = true)
	public void congig_BM() throws IOException
	{
		String URL = FLib.readdatafrompropertyfile("url");
		String USERNAME = FLib.readdatafrompropertyfile("usernameadmin");
		String PASSWORD = FLib.readdatafrompropertyfile("passwordadmin");
		
		driver.get(URL);
		Homepage hp = new Homepage(driver);
		hp.click_AdminLink();
		System.out.println("clicking on adminlink");
		AdminLoginpage al = new AdminLoginpage(driver);
		al.getUsernameTF().sendKeys(USERNAME);
		al.getPasswordTF().sendKeys(PASSWORD);
		System.out.println("enter the un and pwd");
		al.Clic_Loginbutton();
		System.out.println("logedin");
	}
	@AfterMethod(alwaysRun = true)
	public void config_AM()
	{
		//System.out.println("clicing on logout");
		AddPatientpage lb = new AddPatientpage(driver);
		lb.getMyprofileDropDown().click();
		lb.getLogoutbutton().click();
		System.out.println("clicing on logout");
		System.out.println("logoutdone");
	}
	@AfterClass(alwaysRun = true)
	public void config_AC()
	{
		driver.quit();
	}
	@AfterSuite(alwaysRun = true)
	public void config_AS() throws SQLException
	{
		DLib.con.close();
	}

}
