package practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class makemytrip {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.makemytrip.com/");
		Actions actions = new Actions(driver);
		Thread.sleep(10);
		actions.doubleClick().perform();
		Thread.sleep(10);
		driver.findElement(By.xpath("close")).click();
		//actions.doubleClick().perform();
		Thread.sleep(5);
		driver.findElement(By.id("departure")).click();
	}
		

}