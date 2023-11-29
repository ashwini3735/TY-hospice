package practices;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.hms.GenricUtils.IPathConstants;

public class dataproviderusingexcel {
	
	public Object[][] data() throws EncryptedDocumentException, IOException
	{
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\Dataprovider.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet("");
		int rowcount = sh.getLastRowNum();
		int cellcount = sh.getRow(0).getLastCellNum();
		
		Object[][] obj = new Object[rowcount][cellcount];
		
		for (int i = 0; i <= rowcount; i++) {
			for (int j = 0; j <= rowcount; j++) {
				obj[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
				
			}
			
		}
		return obj;
	}

}
