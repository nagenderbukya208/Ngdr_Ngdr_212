package practice.contacttest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateContactWithOrgTest 
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
			Row row=sh.getRow(10);
			String orgName=row.getCell(2).toString()+randomint;
		    String contactLastName= row.getCell(3).getStringCellValue();
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
			  driver.findElement(By.name("accountname")).sendKeys(orgName);
			  driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
			  // Verify header Msg Expected result
		      String headerinfo= driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
			 if(headerinfo.contains(orgName)) {
				 System.out.println(orgName +"is created==>PASS");
			 }else {
				 System.out.println(orgName +"is not created==>FAIL");
			 }
			// Step 5 : Navigate to contact module
			 driver.findElement(By.linkText("Contacts")).click();
			  
			  // Step 6 : Click on "Create Contacts" Button
			  driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
			  // Step 7 : Enter all the details & create new Contacts
			  driver.findElement(By.name("lastname")).sendKeys(contactLastName);
			  driver.findElement(By.xpath("//input[@name='account_name']/following-sibling::img")).click();
			  // Switch to child window
                 Set<String> set=driver.getWindowHandles();
                Iterator<String> it=set.iterator();
                while(it.hasNext()) {
                	String windowId=it.next();
                	driver.switchTo().window(windowId);
                	String actUrl=driver.getCurrentUrl();
                	if(actUrl.contains("module=Accounts")) {
                		break;
                	}
                }
			  driver.findElement(By.name("search_text")).sendKeys(orgName);
			  driver.findElement(By.name("search")).click();
			  driver.findElement(By.xpath("//a[text()='"+orgName+"']")).click();
			  // Switch to parent window
			  Set<String> set1=driver.getWindowHandles();
              Iterator<String> it1=set1.iterator();
              while(it1.hasNext()) {
              	String windowId=it1.next();
              	driver.switchTo().window(windowId);
              	String actUrl=driver.getCurrentUrl();
              	if(actUrl.contains("Contacts&action")) {
              		break;
              	}
              }
			  driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		   
			  // Verify Header phone number info Expected result
			   headerinfo=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
			  if(headerinfo.contains(contactLastName))
			  {
				  System.out.println(contactLastName+"information is verifyed==>PASS");
			  }else {		  
			 System.out.println(contactLastName+"information is Not verifyed==>FAIL");
			   }
			// Verify Header phone number info Expected result
			 String  actOrgName=driver.findElement(By.id("mouseArea_Organization Name")).getText();
			 if(actOrgName.trim().equals(orgName))
			 {
		     System.out.println(orgName+"information is verifyed==>PASS");
			 }else {  
			 System.out.println(orgName+"information is Not verifyed==>FAIL");
			      }
			  driver.quit();
  }
}
