package datadrivenprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;

public class RMGyentaTest {
	public static void main(String[] args) throws Throwable {
		Connection con = null;
		String ExpData = "Hospice";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver:8084/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		//sign into rmg
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rmgyantra");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Projects']")).click();
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		
		driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys("Hospice");
		driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("deepak");
		WebElement status = driver.findElement(By.xpath("//select[@name='status']"));
		
		
		Select sel = new Select(status);
		sel.selectByValue("Created");
		
		driver.findElement(By.xpath("//input[@value='Add Project']")).click();
		
		// check in database
		
		// regestior the driver
				Driver driver1 = new Driver();
				DriverManager.registerDriver(driver1);
				
				// get connection of database
				  con = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects", "root@%", "root");
				  // create statment 
				  Statement state = con.createStatement();
				  String Query = "select* from project;";
				  ResultSet result = state.executeQuery(Query);
				  boolean flag = false;
				  while(result.next())
				  {
					  String actual = result.getString(4);
					  
					  if(actual.equalsIgnoreCase(ExpData));
					  {
						  flag = true;
						  break;
					  }
				  }
				  if(flag)
				  {
					  System.out.println("project created succesfully");
				  }
				  else
				  {
					  System.out.println("not creatted");
				  }
				  
		
	con.close();
	
	
		
	}

}
