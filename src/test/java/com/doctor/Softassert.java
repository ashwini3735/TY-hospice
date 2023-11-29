package com.doctor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;



public class Softassert {
	@Test
	public void SoftAssert()
	{
		String Expecttedtittle  = "Hospital ManagementSystem";
            
		org.testng.asserts.SoftAssert sa = new org.testng.asserts.SoftAssert();
		WebDriver driver = new ChromeDriver();
		driver.get("http://rmgtestingserver/domain/Hospital_Management_System/");
	String	Acualtittle= driver.getTitle();
	sa.assertEquals(Acualtittle, Expecttedtittle);
	
	System.out.println("homepage");
	sa.assertAll();	
	}

}
