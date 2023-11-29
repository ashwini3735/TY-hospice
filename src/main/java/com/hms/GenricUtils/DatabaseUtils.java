package com.hms.GenricUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DatabaseUtils {
	Connection con;
	public void connectDB() throws SQLException
	{
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		con = DriverManager.getConnection(IPathConstants.DBURL, IPathConstants.DB_usrename, IPathConstants.DB_usrename);
	}
	 
	public String executeAndGetData(int colData, String ExpData, String query) throws SQLException
	{
		Statement state = con.createStatement();
		 ResultSet result = state.executeQuery(query);
		 boolean flag = false;
		 while(result.next())
		 {
			 String actual = result.getString(colData);
			 if(actual.equalsIgnoreCase(ExpData))
			 {
				 flag = true;
				 break;
			 }
		 }
		 if (flag)
		 {
			 System.out.println("project creatted succuesfully");
			 return ExpData;
		 }
		 else
		 {
			 System.out.println("project is not creatted");
			 return "";
		 }
	}
	    public void disconnectDB() throws Throwable
	    {
	    	con.close();
	    }
	

}
