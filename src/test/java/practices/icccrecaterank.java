package practices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class icccrecaterank {
	public static void main(String[] args) {
		
		// program to check that contry  flag is precent or not
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		String countryname = "England";
		List<WebElement> ele = driver.findElements(By.xpath("//table/tbody/tr[*]/td[2]/span[2]"));
		
		   boolean flags=false;
		   
		   for(WebElement webEle : ele)
		   {
			   String countynames = webEle.getText();
			   
			   if(countynames.equals(countryname))
			   {
				   System.out.println("is present");
				   flags=true;
				   break;
			   }
		   System.out.println(countynames);
		   
		   }
	if(!flags)
	{
		System.out.println("not present");
	}
		
	}
		
	}


