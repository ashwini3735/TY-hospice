package practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amezonniketopumashoes {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement SarachTF = driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']"));
		SarachTF.click();
		Thread.sleep(5000);
		SarachTF.sendKeys("nike shoes"+Keys.ENTER);
		//SarachTF.sendKeys(Keys.ENTER);
		String name = "Nike";
		int index=15;
		WebElement price = driver.findElement(By.xpath("(//span[text()='"+name+"']/ancestor::div[@class='a-section a-spacing-small puis-padding-left-micro puis-padding-right-micro']/descendant::span[@class='a-price-whole'])[2]"));
		
		System.out.println(price.getText());
		//https://www.amazon.in/s?k=puma+shoes&crid=1VEMT24O3HYAQ&sprefix=puma+s%2Caps%2C833&ref=nb_sb_ss_ts-doa-p_2_6
		
	}

}
