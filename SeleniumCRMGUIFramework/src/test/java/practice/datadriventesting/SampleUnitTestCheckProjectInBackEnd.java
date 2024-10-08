package practice.datadriventesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class SampleUnitTestCheckProjectInBackEnd 
{
@Test
public void projectCheckTest() throws Throwable
{
	String stdname = "nagender";
	boolean flag=false;
	// Step 1 : Load / register the database driver
		Driver driverRef= new Driver();
		DriverManager.registerDriver(driverRef);
		// Step 2 : Connect to database
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/myspace", "root", "admin");
		System.out.println("=====Done====");
			// Step 3 : Create Sql statement
		  Statement stat=conn.createStatement();
			// Step 4 : Execute select query & get result
		  ResultSet resultset=stat.executeQuery("select * from stdinfo");
		  while (resultset.next())
		  {
			String actstdname = resultset.getString(2);
			if(stdname.equals(actstdname))
			{
				flag=true;
				System.out.println(stdname + "isb avilable==> PASS");
			}
		  }
		  if(flag==false)
		  {
			  System.out.println(stdname + " is not avilable==>FAIL");
			  Assert.fail();
		  }
	   // Step 5 : Close the connection
		  conn.close();
}
}
