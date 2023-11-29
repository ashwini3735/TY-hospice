package practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {
	public static void main(String[] args) {
		
		
		
		
		
		ChromeOptions opstions = new ChromeOptions();
		opstions.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opstions);
         driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//div[@id='onwardCal']")).click();
		//driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][3]")).click();
		//driver.findElement(By.xpath("//div[text()='jan' and '2024']/ancestor::div[@class='sc-jzJRlG dPBSOp']/descendant::span[text()='10']")).click();
		//driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][3]")).click();
		for(;;)
			try
		{
				//driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][3]")).click();
		driver.findElement(By.xpath("//div[text()='jan' and '2024']/ancestor::div[@class='sc-jzJRlG dPBSOp']/descendant::span[text()='7']")).click();
		 break;
		}
        
		catch(Exception e)
		{
		  driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][3]")).click();
		  
		}
}}
