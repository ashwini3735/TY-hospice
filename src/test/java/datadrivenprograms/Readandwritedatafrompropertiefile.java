0package datadrivenprograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readandwritedatafrompropertiefile {
	public static void main(String[] args) throws IOException {
		
		//create object for propertie file
		 Properties pobj = new Properties();
		 pobj.setProperty("url", "http://rmgtestingserver/domain/Hospital_Management_System/hms/admin/");
		 pobj.setProperty("username", "admin");
		 pobj.setProperty("password", "Test@12345");
		 
		 // create the object for fileoutputstream
		 FileOutputStream fios = new FileOutputStream(".\\\\src\\\\test\\\\resources\\\\Commendata.properties");
		 pobj.store(fios, "write data");
		 
		      FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\Commendata.properties");
		      pobj.load(fi);
		       String URL = pobj.getProperty("url");
		       String UN = pobj.getProperty("username");
		       String PWD = pobj.getProperty("password");
		       System.out.println(URL);
		       System.out.println(UN);
		       System.out.println(PWD);
		       
		       WebDriver driver = new ChromeDriver();
		       driver.manage().window().maximize();
		       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		       driver.get(URL);
		        
		     //  driver.findElement(By.xpath("//h3[text()='Admin Login']")).click();
		       driver.findElement(By.name("username")).sendKeys(UN);
		       driver.findElement(By.name("password")).sendKeys(PWD);
		       driver.findElement(By.name("submit")).click();
		       
		 
		
	}

}
