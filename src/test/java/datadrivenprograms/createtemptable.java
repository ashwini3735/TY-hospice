package datadrivenprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class createtemptable {
	public static void main(String[] args) throws SQLException {
		// regestior the driver
				Driver driver = new Driver();
				DriverManager.registerDriver(driver);
				
				// get connection of database
				 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ashwini", "root", "root");
				  
				 // create statment 
				  Statement state = con.createStatement();
				  Scanner sc = new Scanner(System.in);
				  System.out.println("Enter the name");
				  String s = sc.next();
				  
		//String qury = "insert into employe values('"+s+"',"+i+");";
		String qury = "Select* from employe;";
		ResultSet result = state.executeQuery(qury);
		boolean flag=false;
		while(result.next())
		{
			String name = result.getString(1);
			if(name.equalsIgnoreCase(s))
			{
				System.out.println(""+s+" name is presant");
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			Random n = new Random();
			int age = n.nextInt(100);
			String qurey1="insert into employe values('"+s+"',"+age+");";
			int result1=state.executeUpdate(qurey1);
			if(result1==1)
			{
				System.out.println(""+s+" is added successfully");
				
			}
			else
			{
				System.out.println(""+s+" is not added");
			}}
		// close database
		con.close();}
	}


