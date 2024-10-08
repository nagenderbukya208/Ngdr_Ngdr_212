package practice.datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateOrg 
{
public static void main(String[] args) throws Throwable 
{
	//read common data from properties file
	FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Desktop\\commondata.properties");
	Properties pobj=new Properties();
	pobj.load(fis);
  String Browser =pobj.getProperty("browser");
  String URL =pobj.getProperty("url");
  String USERNAME =pobj.getProperty("username");
  String PASSWORD =pobj.getProperty("password");
  // read test Script data from Excel file
	FileInputStream fis2=new FileInputStream("D:\\Tek Pyramid Trining\\Selenium\\DDT\\Excel\\Org.xlsx");
	Workbook wb=WorkbookFactory.create(fis2);
	Sheet sh=wb.getSheet("sheet1");
	Row row=sh.getRow(1);
   String OrgName= row.getCell(2).toString();
   wb.close();
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
  // Step 1 :Login  to app
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
  // Step 5 : Logout App
  Actions act=new Actions(driver);
  
  WebElement Pro = driver.findElement(By.xpath("(//img[@style='padding: 0px;padding-left:5px'])[1]"));
  act.moveToElement(Pro).perform();
  Thread.sleep(2000);
 // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
 // wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='ondemand_sub']"))));
  driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
  driver.quit();
}

}
