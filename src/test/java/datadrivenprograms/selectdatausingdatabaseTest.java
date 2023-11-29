package datadrivenprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class selectdatausingdatabaseTest {
	public static void main(String[] args) throws Throwable {
		
		// regestior the driver
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		// get connection of database
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ashwini", "root", "root");
		
		 // create statment 
		  Statement state = con.createStatement();
		  String query = "select* from student_info;";
		  
		  // execute query
		  ResultSet result = state.executeQuery(query);
		  
		  while(result.next())
		  {
			  System.out.println(result.getString(1)+"  "+result.getString(2)+"  "+result.getString(3));
			  
		  }
		  // close database
		  con.close();
	}

}
