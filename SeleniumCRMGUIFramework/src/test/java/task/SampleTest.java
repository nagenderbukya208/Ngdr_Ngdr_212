package task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class SampleTest 
{
public static void main(String[] args) throws Throwable
{
	// Step 1 : Load / register the database driver
	Driver driverRef= new Driver();
	DriverManager.registerDriver(driverRef);
	// Step 2 : Connect to database
Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3307/myspace", "root", "admin");
System.out.println("=====Done====");
	// Step 3 : Create Sql statement
  Statement stat=conn.createStatement();
	// Step 4 : Execute select query & get result
  ResultSet resultset=stat.executeQuery(" select * from stdinfo");
  while(resultset.next())
  {
	  System.out.println(resultset.getString(1) + "\t"+ resultset.getString(2)+ "\t"+ resultset.getString(3));
  }
	// step 5 : Close the connection
  conn.close();
}
}
