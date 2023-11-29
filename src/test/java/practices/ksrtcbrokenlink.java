package practices;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class ksrtcbrokenlink {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ksrtc.in/oprs-web/");
		//driver.get("https://www.tnstc.in/home.html");
	    List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		System.out.println(alllinks.size());
		
		
		
		ArrayList<String> arrlinks=new ArrayList<String>();
		
		for(int i=0;i<alllinks.size();i++)
		{
			
			String eachlink=alllinks.get(i).getAttribute("href");
		    
			URL url=null;
			int statuscode=0;
			
			try
			{
	          url=new URL(eachlink);
	          HttpURLConnection httpurlconn=(HttpURLConnection)url.openConnection();
	          statuscode=httpurlconn.getResponseCode();
	          
	          if(statuscode>=400)
	          {
	        	  arrlinks.add(eachlink);
	        	  System.out.println(eachlink +"----->"+ statuscode);
	          }
				
			}
			catch(MalformedURLException e)
			{
             
             System.out.println(eachlink +"----->"+ statuscode);
			}
		}

		
	}

}
