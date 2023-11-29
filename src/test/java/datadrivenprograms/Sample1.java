package datadrivenprograms;

import org.testng.annotations.Test;

import com.hms.GenricUtils.BaseClass;

public class Sample1 extends BaseClass{
	@Test (groups="regration")
	public void test1()
	{
		System.out.println("--sample--test1--");
	}
	@Test
	public void test2()
	{
		System.out.println("--sample--test2--");
	}

}
