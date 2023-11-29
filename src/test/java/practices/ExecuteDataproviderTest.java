package practices;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hms.GenricUtils.ExcelUtilite;

public class ExecuteDataproviderTest {
	@Test(dataProvider = "getdatafromexcel" )
	public void getdata(String from,String To)
	{
		System.out.println(from+"---"+To);
	}
	@DataProvider
	public Object[][] getdatafromexcel() throws EncryptedDocumentException, IOException
	{
		ExcelUtilite el = new ExcelUtilite();
		Object[][] value = el.getmultiplesetofdata("Sheet1");
		return value;
	}

}
