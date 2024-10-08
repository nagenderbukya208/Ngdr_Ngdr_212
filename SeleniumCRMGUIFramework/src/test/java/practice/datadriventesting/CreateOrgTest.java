package practice.datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateOrgTest 
{
public static void main(String[] args) throws IOException 
{

	//step-1 :get the java representation object of the physical file
		FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Desktop\\commondata.properties");
		// step-2 : using properties class , load all the keys
		Properties pobj=new Properties();
		pobj.load(fis);
		// step-3 : get the value based on key
	  String Browser =pobj.getProperty("browser");
	  String URL =pobj.getProperty("url");
	  String USERNAME =pobj.getProperty("username");
	  String PASSWORD =pobj.getProperty("password");
	
	  WebDriver driver= null;
	  if(Browser.equals("chrome")) {
		  driver=new ChromeDriver();
	  }else if(Browser.equals("firefox")) {
			  driver=new FirefoxDriver();
		  }else if(Browser.equals("edge")) {
			  driver=new EdgeDriver();
	  }else {
		  driver=new ChromeDriver();
	  }
	  driver.get(URL);
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	  driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	  driver.findElement(By.id("submitButton")).click();
	  driver.findElement(By.linkText("Organizations")).click();
	  driver.quit();
}
}
