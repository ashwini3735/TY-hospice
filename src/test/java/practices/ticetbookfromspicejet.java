package practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ticetbookfromspicejet {
	public static void main(String[] args) throws Throwable {
		
		ChromeOptions opstions = new ChromeOptions();
		opstions.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opstions);
         driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.spicejet.com/");
		
		//select round trip
        driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-zso239'])[2]")).click();
        // from
       WebElement from = driver.findElement(By.xpath("//div[text()='From']"));
             from.click();
             driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3']/div/div/div/div[text()='Bengaluru']")).click();
             
    		  
        Thread.sleep(5000);
        // to
    WebElement to = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-destination\"]"));
    
        to.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()=\"Sardar Vallabhbhai Patel International Airport\"]")).click();
        // select the date
        driver.findElement(By.xpath("//div[@data-testid='undefined-month-November-2023']"));
    				
	
	}
}
