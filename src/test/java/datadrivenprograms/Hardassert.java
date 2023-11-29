package datadrivenprograms;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class Hardassert {
	@Test
	public void Hardasset_test1()
	{
		String exp="B";
		System.out.println("---test1---");
		System.out.println("---test2---");
		System.out.println("---test3---");
		assertEquals("A", exp, "k");
		System.out.println("---test4---");
		System.out.println("---test5---");
	
	}
	
	@Test
	public void Hardassetr_test2()
	{
		int a=null;
		System.out.println("---test1---");
		System.out.println("---test2---");
		System.out.println("---test3---");
		assertNotNull(a);
		System.out.println("---test4---");
		System.out.println("---test5---");
	}

}
