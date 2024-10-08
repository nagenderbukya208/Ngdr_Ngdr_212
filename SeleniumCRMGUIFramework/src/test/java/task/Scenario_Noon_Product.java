 package task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Scenario_Noon_Product 
{
public static void main(String[] args) throws Throwable 
{
	FileInputStream fis=new FileInputStream("D:\\Tek Pyramid Trining\\Selenium\\DDT\\Excel\\Emt2.xlsx");
	Workbook wb1=WorkbookFactory.create(fis);
	Sheet sh1=wb1.createSheet("Sheet1"+Math.random());
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.noon.com/uae-en/");
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(1000);
	List<WebElement> product= driver.findElements(By.xpath("//span[contains(text(),'Apple')]"));
	int i =1,j=0;
	for (; i <=6; i++)
	{
		
	
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[5]/div/div/div/div/div/div/div/div[2]/div[2]")).click();
	Thread.sleep(1000);
	product= driver.findElements(By.xpath("//span[contains(text(),'Apple')]"));
  for(WebElement pro:product)
   {
	  if(pro.getText().contains("Apple"))
	  {
	   String apple=pro.getText();
	   System.out.println(apple);
	 Row row1=sh1.createRow(j++);
	 		row1.createCell(0).setCellValue(apple);
	  }
   }
	}
 
		FileOutputStream fos=new FileOutputStream("D:\\Tek Pyramid Trining\\Selenium\\DDT\\Excel\\Emt2.xlsx");
		wb1.write(fos);
		wb1.close();

  }
}

