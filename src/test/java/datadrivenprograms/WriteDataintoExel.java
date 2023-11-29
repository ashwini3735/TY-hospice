package datadrivenprograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataintoExel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\ty.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet("");
		sh.createRow(4).createCell(0).setCellValue("");
		 FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\ty.xlsx");
		 wb.write(fos);
		 wb.close();
		
	}
	

}
