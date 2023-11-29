package datadrivenprograms;

import org.testng.annotations.Test;

import com.hms.GenricUtils.BaseClass;

public class practies1 extends BaseClass{
	@Test (groups={"smoke" , "regration"})
	public void test1()
	{
		System.out.println("--practes--test1--");
	}
	@Test(groups="regration")
	public void test2()
	{
		System.out.println("--practes--test2--");
	}

}
