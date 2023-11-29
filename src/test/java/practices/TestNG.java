package practices;

import org.testng.annotations.Test;

public class TestNG<dependason> {
	@Test(priority=1)
	public void Login()
	{
	System.out.println("login ");
	}
	
	@Test()
	public void createtest()
	{
		System.out.println("test creatted");
	}
	
	@Test(dependsOnMethods = "createtest")
	public void edittest()
	{
		System.out.println("test editted");
	}
	
	@Test( priority=)
	public void Deletetest()
	{
		System.out.println("test deletted");
		
	}
	
	@Test(dependsOnMethods = "createtest",invocationCount = 0)
	public void Resulttest()
	{
		System.out.println("Result test");
	}
	@Test(dependsOnMethods ="Login")
	public void logout()
	{
		System.out.println("logout");
	}


}
