package practices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcartproduct {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/search?q=samsung&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		  List<WebElement> Allproductname = driver.findElements(By.xpath("//a[@class='s1Q9rs']"));
		    List<WebElement> Allproductprice = driver.findElements(By.xpath("//div[@class='_30jeq3']"));
		    for (int i = 0; i < Allproductname.size(); i++) {
		    	String productname = Allproductname.get(i).getText();
		    	String Productprice = Allproductprice.get(i).getText();
		    	System.out.println(productname+"-----"+Productprice);
		    	//System.out.println(Allproductname.get(i).getText());
		    	//System.out.println(Allproductprice.get(j).getText());
				
			}
		  
	}

}
