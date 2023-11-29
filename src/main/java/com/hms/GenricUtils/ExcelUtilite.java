package com.hms.GenricUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExcelUtilite {
	
	/**
	 * This methiod is used to read data from excel file
	 * @author ashwini
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return 
	 * @return 
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public String ReadDataFromExel(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fi = new FileInputStream(IPathConstants.ExcelPath);
		   Workbook wb = WorkbookFactory.create(fi);
		   Sheet sh = wb.getSheet(sheetname);
		   String value = sh.getRow(row).getCell(cell).getStringCellValue();
		   return value;
		   
		   
	}
	/**
	 * this method is used to get total row count
	 * @author ashwini
	 * @return 
	 * @return
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 * @throws
	 */
	public int getLastRowno(String sheetname) throws EncryptedDocumentException, IOException
	
	{
		FileInputStream fi = new FileInputStream(IPathConstants.ExcelPath);
		   Workbook wb = WorkbookFactory.create(fi);
		   Sheet sh = wb.getSheet(sheetname);
		   int count = sh.getLastRowNum();
		   return count;
		
	}
	/**
	 * this method is used to writedatafromexcel
	 * @author ashwini
	 * @return
	 * @throws IOException 
	 * @throws
	 * 
	 */
	public void writedataintoExcel(String sheetname,int row,int cell,String data) throws IOException
	{
		javaUtiles jLib = new javaUtiles();
		FileInputStream fi = new FileInputStream(IPathConstants.ExcelPath);
		   Workbook wb = WorkbookFactory.create(fi);
		   Sheet sh = wb.getSheet(sheetname);
		   sh.createRow(row).createCell(cell).setCellValue(data);
		 FileOutputStream fout = new FileOutputStream(IPathConstants.ExcelPath);
		 wb.write(fout);
		 wb.close();
	}
	/**
	 * the method is used to readdatafrommultipele
	 * @throws IOException 
	 */
		  public void readmultipledata(String sheetname,WebDriver driver) throws IOException 
		  {
			 
				FileInputStream fi = new FileInputStream(IPathConstants.ExcelPath);
				   Workbook wb = WorkbookFactory.create(fi);
				   Sheet sh = wb.getSheet(sheetname);
				   int count = sh.getLastRowNum();
				   
				   HashMap<String, String> map	= new   HashMap<String, String>();
				   for(int i=0; i<=count;i++)
				   {
					   String key = sh.getRow(i).getCell(0).getStringCellValue();
					   String value = sh.getRow(i).getCell(1).getStringCellValue();
					   map.put(key, value);
					   
				   }
				   for (Entry<String, String> data: map.entrySet()) 
				   {
					   
					   
					WebElement e1 = driver.findElement(By.name(data.getKey()));
					e1.clear();
						 e1.  sendKeys(data.getValue());
					   
					   
						   
					   
					
				}
				   
		  }
		  public Object[][] getmultiplesetofdata(String Sheetname)throws EncryptedDocumentException, IOException
			{
				FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\Dataprovider.xlsx");
				Workbook wb = WorkbookFactory.create(fi);
				Sheet sh = wb.getSheet(Sheetname);
				int rowcount = sh.getLastRowNum();
				int cellcount = sh.getRow(0).getLastCellNum();
				
				Object[][] obj = new Object[rowcount][cellcount];
				
				for (int i = 0; i < rowcount; i++) {
					for (int j = 0; j < rowcount; j++) {
						obj[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
						
					}
					
				}
				return obj;
			}
		   
	
	
	
		
	

}
