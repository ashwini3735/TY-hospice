
package com.hms.GenricUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtiles {
	/**
	 * this mathod is used to read data from propertyfile
	 * @param key
	 * @return
	 * @throws IOException 
	 */
	
	public String readdatafrompropertyfile(String key) throws IOException
	{
		 FileInputStream fis = new FileInputStream(IPathConstants.FilePath);
		 Properties pLib = new Properties();
		 pLib.load(fis);
		 String Value = pLib.getProperty(key);
		 return Value;
		 
	}

}
