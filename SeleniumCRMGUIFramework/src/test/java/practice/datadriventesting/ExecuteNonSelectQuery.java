package practice.datadriventesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteNonSelectQuery
{
	public static void main(String[] args) throws Throwable 
	{
		Driver driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/myspace\", \"root\", \"admin");
		System.out.println("***Done***");
Statement stat=conn.createStatement();
	}
}
