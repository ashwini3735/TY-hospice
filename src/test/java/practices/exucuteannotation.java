package practices;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class exucuteannotation {
	@BeforeSuite
	public void Bs()
	{
		System.out.println("bs");
	}
	@BeforeClass
	public void Bc()
	{
		System.out.println("bc");
	}
	@BeforeClass
	public void Bc1()
	{
		System.out.println("bc1");
	}
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	@BeforeMethod
	public void Bm1 ()
	{
		System.out.println("bm1");
	}
	@AfterMethod
	public void Am()
	{
		System.out.println("am");
	}
	@AfterClass
	public void Ac1()
	{
		System.out.println("ac1");
	}
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	@BeforeMethod
	public void Bm2()
	{
		System.out.println("am2");
	}
	@AfterClass
	public void Ac2()
	{
		System.out.println("ac2");
	}
	@BeforeMethod
	public void Bm3()
	{
		System.out.println("am3");
	}
	@AfterMethod
	public void Am2()
	{
		System.out.println("am2");
	}
	@AfterSuite
	public void As()
	{
		System.out.println("as");
	}
	
	
	
	
	
	

}
