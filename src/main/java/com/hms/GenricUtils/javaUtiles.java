package com.hms.GenricUtils;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class javaUtiles {
	

	public int getRandomNo() {
		Random ran = new Random();
		int random = ran.nextInt(500);
		
		
		return random;
	}
	 public String systemDate()
	 {
		 Date date = new Date();
		 String systemdate = date.toString();
		 return systemdate;
	 }
	 public String systemDateinFormat()
	 {
		 SimpleDateFormat dataformat = new SimpleDateFormat("dd/MM/yyyy HH-mm-ss");
		 Date date = new Date();
		 
		String systemDateinFormat = dataformat.format(date);
		 return systemDateinFormat;
		 
	 }
	

}
