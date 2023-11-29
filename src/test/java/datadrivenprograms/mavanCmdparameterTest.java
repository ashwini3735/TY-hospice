package datadrivenprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mavanCmdparameterTest{
	
	@Test
	public void cmdparametertest()
	{
		String BROWSER=System.getProperty("browser");
		String URL = System.getProperty("url");
		String USERNAME = System.getProperty("username");
		
		String PASSWORD = System.getProperty("password");
		
		  WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       driver.get(URL);
	        
	     //  driver.findElement(By.xpath("//h3[text()='Admin Login']")).click();
	       driver.findElement(By.name("username")).sendKeys(USERNAME);
	       driver.findElement(By.name("password")).sendKeys(PASSWORD);
	       driver.findElement(By.name("submit")).click();
	}
	

}
