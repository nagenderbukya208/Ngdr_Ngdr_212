package practice.datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
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
import org.testng.annotations.Test;

public class RunTimeMavenParameterTest 
{
@Test
public void runTimeParameterTest() throws Throwable
{
	// Read common data from CMD line
	String URL=System.getProperty("url");
	String BROWSER=System.getProperty("browser");
	String USERNAME=System.getProperty("username");
	String PASSWORD=System.getProperty("password");
	// Generate the random number
	Random random=new Random();
	int randomint=random.nextInt(1000);
	// Read testscript data from excel file
	FileInputStream fis2=new FileInputStream("D:\\Tek Pyramid Trining\\Selenium\\DDT\\Excel\\Org.xlsx");
	Workbook wb=WorkbookFactory.create(fis2);
	Sheet sh=wb.getSheet("sheet1");
	Row row=sh.getRow(1);
   String OrgName= row.getCell(2).toString()+ randomint;
   wb.close();
  WebDriver driver= null;
  
  if(BROWSER.equals("chrome")) {
	  driver=new ChromeDriver();
  }else if(BROWSER.equals("firefox")) {
		  driver=new FirefoxDriver();
	  }else if(BROWSER.equals("edge")) {
		  driver=new EdgeDriver();
  }else {
	  driver=new ChromeDriver();
  }
//	System.out.println("Env Data==>URL===>"+URL);
//	System.out.println("BROWSER Data==>BROWSER===>"+BROWSER);
//	System.out.println("USERNAME Data==>USERNAME===>"+USERNAME);
//	System.out.println("PASSWORD Data==>PASSWORD===>"+PASSWORD);
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
	  driver.manage().window().maximize();
	  driver.get(URL);
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	  driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	  driver.findElement(By.id("submitButton")).click();
	  // Step 2: Navigate to organization module
	  driver.findElement(By.linkText("Organizations")).click();
	  // Step 3 : Click on create organization Button
	  driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	  // Step 4 : Enter all the details & create new organization
	  driver.findElement(By.name("accountname")).sendKeys(OrgName);
	  driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
	  driver.quit();

}
}
