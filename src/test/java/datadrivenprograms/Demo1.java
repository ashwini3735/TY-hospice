package datadrivenprograms;

import org.testng.annotations.Test;

import com.hms.GenricUtils.BaseClass;

public class Demo1 extends BaseClass{
	@Test(groups="smoke")
	public void test1()
	{
		System.out.println("--Demo--test1--");
	}
	@Test
	public void test2()
	{
		System.out.println("--Demo--test2--");
	}

}
