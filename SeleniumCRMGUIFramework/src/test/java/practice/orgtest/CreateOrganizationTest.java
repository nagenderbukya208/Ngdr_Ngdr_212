package practice.orgtest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateOrganizationTest 
{
public static void main(String[] args) throws Throwable 
{
	//read common data from properties file
	FileInputStream fis = new FileInputStream("D:\\Tek Pyramid Trining\\Selenium\\DDT\\commondata.properties");
	Properties pobj=new Properties();
	pobj.load(fis);
	  String Browser =pobj.getProperty("browser");
	  String URL =pobj.getProperty("url");
	  String USERNAME =pobj.getProperty("username");
	  String PASSWORD =pobj.getProperty("password");
	  //generate the random number
	  Random random=new Random();
	  int randomint=random.nextInt(1000);
	  //read testScript data from Excel file
	  FileInputStream fis1=new FileInputStream("D:\\Tek Pyramid Trining\\Selenium\\DDT\\Excel\\Org.xlsx");
		Workbook wb=WorkbookFactory.create(fis1);
		Sheet sh=wb.getSheet("org");
		Row row=sh.getRow(1);
	    String orgname= row.getCell(2).toString()+randomint;
	    wb.close();
	                // achieving Polymorphism program
	    WebDriver driver= null;
		  if(Browser.equals("chrome")){
			driver=new ChromeDriver();  }
		  else if(Browser.equals("firefox")){
			 driver=new FirefoxDriver();}
		  else if(Browser.equals("edge")){
		    driver=new EdgeDriver();}
		  else {
			 driver=new ChromeDriver();
		 }
		  // Step 1 : Login to app
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get(URL);
		  driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		  driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		  driver.findElement(By.id("submitButton")).click();
		  
		  // Step 2 : Navigate to Organization module
		  driver.findElement(By.linkText("Organizations")).click();
		  
		  // Step 3 : Click on "Create organization" Button
		  driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		  // Step 4 : Enter all the details & create new organization
		  driver.findElement(By.name("accountname")).sendKeys(orgname);
		  driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
		  // Verify header msg Expected result
	      String headerinfo= driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		 if(headerinfo.contains(orgname)) {
			 System.out.println(orgname+"is created==>PASS");
		 }else {
			 System.out.println(orgname+"is not created==>FAIL");
		 }
		  // Verify header orgname info Expected result
		 String actorgname= driver.findElement(By.id("dtlview_Organization Name")).getText();
		 if(actorgname.equals(orgname)) {
			 System.out.println(orgname+"is created==>PASS");
		 }else {
			 System.out.println(orgname+"is not created==>FAIL");
		 }
// logout
		 driver.quit();
}
}
