package practices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class olamicmedals {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		List<WebElement> Allcontryname = driver.findElements(By.xpath("//span[@data-cy='country-name']"));
		List<WebElement> listofgoldm = driver.findElements(By.xpath("//div[@title='Gold']"));
		List<WebElement> listofsliver = driver.findElements(By.xpath("//div[@title='Silver']"));
		List<WebElement> listofBrown = driver.findElements(By.xpath("//div[@title='Bronze']"));
		String	contryname = "Australia"; 
		//listofTottalmedal = driver.findElement(By.xpath("))
		for (int i = 0; i < Allcontryname.size(); i++) {
			String name = Allcontryname.get(i).getText();
			String golden = listofgoldm.get(i).getText();
			String sliver = listofsliver.get(i).getText();
			String Brown = listofBrown.get(i).getText();
			if(name.equals(contryname))
			{
			System.out.println(name+"---"+golden+"----"+sliver+"----"+Brown);
			
		}
	}

}}
