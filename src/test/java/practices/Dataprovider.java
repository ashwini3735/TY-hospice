package practices;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	@Test(dataProvider = "data" )
	public void getdata(String from,String To,int price)
	{
		System.out.println(from+"---"+To+"----"+price);
	}
	@DataProvider
	public Object[][] data(){
	
	Object[][] obj = new Object[2][3];
	obj[0][0] = "banglore";
	obj[0][1] = "mysore";
	obj[0][2]=1000;
	
	obj[1][0] = "mubai";
	obj[1][1] = "channai";
	obj[1][2]=2000;
	return obj;
	
}
	@DataProvider
	public Object[][] store()
	{
		Object[][] obj = new Object[2][2];
		obj[0][0] = "banglore";
		obj[0][1] = "mysore";
		
		
		obj[1][0] = "mubai";
		obj[1][1] = "channai";
	return obj;	
	}
	
	
}
