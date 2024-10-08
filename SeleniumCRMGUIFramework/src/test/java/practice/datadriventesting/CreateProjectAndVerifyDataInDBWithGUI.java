package practice.datadriventesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.mysql.jdbc.Driver;

public class CreateProjectAndVerifyDataInDBWithGUI
{
public static void main(String[] args) throws Throwable 
{
	// Create Project in GUI Using Selenium code
	String projectname="Instagram_208";
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://106.51.90.215:8084/");
	driver.findElement(By.id("username")).sendKeys("rmgyantra");
	driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
	driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	driver.findElement(By.linkText("Projects")).click();
	driver.findElement(By.xpath("//span[text()='Create Project']")).click();
	driver.findElement(By.name("projectName")).sendKeys(projectname);
	driver.findElement(By.name("createdBy")).sendKeys("nagender");
	Select sel=new Select(driver.findElement(By.name("status")));
	sel.selectByIndex(0);
	driver.findElement(By.xpath("//input[@value='Add Project']")).click();
	// Verify the project in BackEnd [DB] using JDBC
	boolean flag= false;
			Driver driverRef= new Driver();
			DriverManager.registerDriver(driverRef);
			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/myspace", "root", "admin");
			System.out.println("=====Done====");
			  Statement stat=conn.createStatement();
			  ResultSet resultset=stat.executeQuery("select * from stdinfo");
			  while (resultset.next())
			  {
				String actprojectname = resultset.getString(2);
				if(projectname.equals(actprojectname))
				{
					flag=true;
					System.out.println(projectname + "isb avilable==> PASS");
				}
			  }
			  if(flag==false)
			  {
				  System.out.println(projectname + " is not avilable i DB==>FAIL");
			  }
			  conn.close();
	

}
}
