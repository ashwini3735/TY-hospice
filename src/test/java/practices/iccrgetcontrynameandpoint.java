package practices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iccrgetcontrynameandpoint {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		String firstpostioncountry = driver.findElement(By.xpath("(//span[@class='u-hide-phablet'])[position()=1]")).getText();
		////table/tbody/tr/td[text()='1']
		String firstpostionmatch = driver.findElement(By.xpath("(//td[@class='rankings-block__banner--matches'])[1]")).getText();
		        String firstpostionpoint = driver.findElement(By.xpath("(//td[@class='rankings-block__banner--points'])[1]")).getText();
		        System.out.println(firstpostioncountry+"-----"+firstpostionmatch+"-----"+firstpostionpoint);
		List<WebElement> Allcontry = driver.findElements(By.xpath("//table/tbody/tr/td/span[@class='u-hide-phablet']"));
		    List<WebElement> Allmatch = driver.findElements(By.xpath("//td[@class='table-body__cell rankings-table__team']/following-sibling::td[@class='table-body__cell u-center-text'][1]"));
	           List<WebElement> Allpoint = driver.findElements(By.xpath("//td[@class='table-body__cell rankings-table__team']/following-sibling::td[@class='table-body__cell u-center-text'][2]"));	
	
	for (int i = 0; i <Allmatch.size() ; i++) {
		
		String country = Allcontry.get(i).getText();
		String matchs = Allmatch.get(i).getText();
		String points = Allpoint.get(i).getText();
		System.out.println(country+"----"+matchs+"-----"+points);
		
	}
	}

}
