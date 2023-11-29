package datadrivenprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;


public class NonSelectFileTest {
	public static void main(String[] args) throws Throwable {
		
		// regestior the driver
				Driver driver = new Driver();
				DriverManager.registerDriver(driver);
				
				// get connection of database
				 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ashwini", "root", "root");
				
				 // create statment 
				  Statement state = con.createStatement();
		String qury = "insert into student_info values('ram',25,12345,'abs'),('gham',24,12345,'abcj');";
		
		
		// execute update query
		int result = state.executeUpdate(qury);
		
		if(result>=1)
		{
			System.out.println("data inserted successfully");
		}
		else
		{
			System.out.println("data is not updated");
		}
		
		// close database
		con.close();
	}

}
