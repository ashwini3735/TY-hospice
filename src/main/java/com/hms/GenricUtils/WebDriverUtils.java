package com.hms.GenricUtils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {
	
	/**
	 * this method is used to maximize the wimdow
	 * @param driver
	 */
	
	public void  maximizewindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	/**
	 * this method is usedto minimize the window
	 * @param driver
	 */
	
	public void minimizewindow(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	/**
	 * this method is used to Wait until page load
	 * @param driver
	 * @param sec
	 */
	
	public void waitforPageLoad(WebDriver driver,int sec)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		
	}
	/**
	 * this method is used to Waituntilelement is visible
	 * @param driver
	 * @param element
	 * @param sec
	 */
	
	public void waituntitEleTobevisible(WebDriver driver,WebElement element,int sec)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	/**
	 * this method is used to clickable
	 * @param driver
	 * @param element
	 * @param sec
	 */
	public void waituntitEleTobeclickable(WebDriver driver,WebElement element,int sec)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	/**
	 * this method is used to select dropdown by index
	 * @param element
	 * @param index
	 */
	public void dropdown(WebElement element,int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	/**
	 * this method is used to slect dropdown by visibaletext
	 * @param element
	 * @param Text
	 */
	public void dropdownbytext(WebElement element,String Text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(Text);
	}
	/**
	 * this method is used to slelect dropdwon by value
	 * @param element
	 * @param value
	 */
	
	public void dropdownbyvalue(WebElement element,String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	 public void draganddrop(WebDriver driver,WebElement src,WebElement des)
	 {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, des).perform();
	 }
	 public void dubuleclick(WebDriver driver,WebElement elemnt)
	 {
		Actions a = new Actions(driver);
		a.doubleClick(elemnt).perform();
	 }
	 public void rightclickonwebpage(WebDriver driver)
	 {
		Actions a = new Actions(driver);
		a.contextClick().perform();
	 }
	 public void rightclickonwebelemnt(WebDriver driver,WebElement elemnt)
	 {
		Actions a = new Actions(driver);
		a.contextClick(elemnt).perform();
	 }
	 public void keypress(WebDriver driver)
	 {
		Actions a = new Actions(driver);
		a.sendKeys(Keys.ENTER).perform();
	 }
	 public void keypressEnter() throws Throwable
	 {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	 }
	 public void keyReleaseEnter() throws Throwable
	 {
		Robot r = new Robot();
		r.keyRelease(KeyEvent.VK_ENTER);
	 }
	 public void SwitchToFrame(WebDriver driver, int index)
	 {
		 driver.switchTo().frame(index);
	 }
	 public void SwitchToFrame(WebDriver driver, String nameOrId)
	 {
		 driver.switchTo().frame(nameOrId);
	 }
	 public void SwitchToFrame(WebDriver driver, WebElement adress)
	 {
		 driver.switchTo().frame(adress);
	 }
	 public void SwitchToWindow(WebDriver driver, String nameOrHandle)
	 {
		 driver.switchTo().window(nameOrHandle);
	 }
	 public void SwichToWindow(WebDriver driver,String partialWinTitle)
	 {
		 Set<String> windows = driver.getWindowHandles();
		  Iterator<String> it = windows.iterator();
		  while(it.hasNext())
		  {
			  String winld= it.next();
		  
		  String currentWinTitle = driver.switchTo().window(winld).getTitle();
		  if(currentWinTitle.contains(partialWinTitle))
		  { 
			  break;
		  }
		  }
	 }
	 public String Handlealartpopuptext(WebDriver driver)
	 {
		String Text= driver.switchTo().alert().getText();
		return Text;
	 }
	 
	 public void Handlealartpopupaccept(WebDriver driver)
	 {
		 driver.switchTo().alert().accept();
	 }
	 public void Handlealartpopupdismis(WebDriver driver)
	 {
		 driver.switchTo().alert().dismiss();
	 }
	 public void HandleScrollbar(WebDriver driver)
	 {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeAsyncScript("window.ScrollBy(0,500)");
	 }
	 public static String getScreenShot(WebDriver driver,String screenShotName) throws Throwable 
	 {
		 TakesScreenshot ts =(TakesScreenshot)driver;
		 File src= ts.getScreenshotAs(OutputType.FILE);
		 String path = ".\\screenshot\\"+screenShotName+".png";
		 File dst = new File(path);
		 FileUtils.copyFile(src, dst);
		 return path;
	 }
	 
	 public void scrollAction(WebDriver driver,WebElement element)
	 {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 int y = element.getLocation().getY();
		 js.executeScript("window.scrollBy(0,"+y+")");
		 js.executeScript("argument[0].scrollintoview()", element);
	 }
	 
	 
	
		
	 
	
	
	
	

}
