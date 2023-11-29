package datadrivenprograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReaddatafromExalfileTest {
	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		
		// creat obj for physical reprasention
		
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\ty.xlsx");
		   Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet("Tydata");
		int rowcount = sh.getLastRowNum();
		int celcount = sh.getRow(0).getLastCellNum();
		System.out.println(rowcount);
		for (int i = 0; i <= rowcount; i++) 
		{
			for (int j = 0; j < celcount; j++) {
				String value = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value);
				System.out.print(" ");
			}
			System.out.print(" ");
		}
		
	}
}
