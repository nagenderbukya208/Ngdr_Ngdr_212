package practice.contacttest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateContactWithSupportDateTest
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
		Sheet sh=wb.getSheet("contact");
		Row row=sh.getRow(4);
	    String lastName= row.getCell(2).toString()+randomint;
	    wb.close();
        // achieving Polymorphism program
        WebDriver driver=null;
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
		  
		  // Step 2 : Navigate to Contacts module
		  driver.findElement(By.linkText("Contacts")).click();
		  
		  // Step 3 : Click on "Create Contacts" Button
		  driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		  // Step 4 : Enter all the details & create new Contacts
		  Date dateobj= new Date();
			SimpleDateFormat sim= new SimpleDateFormat("yyyy-MM-dd");
		    String startDate =sim.format(dateobj);
		   
		    Calendar cal= sim.getCalendar();
		    cal.add(Calendar.DAY_OF_MONTH,30);
		    String endDate= sim.format(cal.getTime());
		
		  driver.findElement(By.name("lastname")).sendKeys(lastName);
		  driver.findElement(By.name("support_start_date")).clear();
		  driver.findElement(By.name("support_start_date")).sendKeys(startDate);
		  driver.findElement(By.name("support_end_date")).clear();
		  driver.findElement(By.name("support_end_date")).sendKeys(endDate);
		  driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
	   
		  // Verify header phone number info Expected result
		 String actLastName= driver.findElement(By.id("dtlview_Last Name")).getText();
		 if(actLastName.equals(lastName)) {
			 System.out.println(lastName+"is created==>PASS");
		 }else {
			 System.out.println(lastName+"is not created==>FAIL");
		 }
		  // Verify ActualStartDate info Expected result
		 String actStartDate= driver.findElement(By.id("dtlview_Support Start Date")).getText();
		 if(actStartDate.equals(startDate)) {
			 System.out.println(startDate +"is created==>PASS");
		 }else {
			 System.out.println(startDate +"is not created==>FAIL");
		 }
		  // Verify ActualEndDate info Expected result
		 String actEndDate= driver.findElement(By.id("dtlview_Support End Date")).getText();
		 if(actEndDate.equals(endDate)) {
			 System.out.println(endDate +"is created==>PASS");
		 }else {
			 System.out.println(endDate +"is not created==>FAIL");
		 }
// logout
		 driver.quit();
}
}
