package practices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amezoniphoneprice {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/s?k=iphone&crid=3FDI6COEACBD4&sprefix=iphone%2Caps%2C217&ref=nb_sb_noss_1");
		List<WebElement> allproduct = driver.findElements(By.xpath("//a/span[@class='a-size-medium a-color-base a-text-normal']"));
	String	contryname = " "; 
		List<WebElement> allprice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		////div[@class='puisg-col-inner']/div[@class='a-section a-spacing-small a-spacing-top-small']
		for (int i = 0; i <allproduct.size(); i++) {
			
			String product = allproduct.get(i).getText();
			String price = allprice.get(i).getText();
			char[] digits = price.toCharArray();
			if (digits.length<=6 && digits[0]<='5')
				
		
				System.out.println(product+"----"+price);
				
				
			}
			
			
		}
	}


