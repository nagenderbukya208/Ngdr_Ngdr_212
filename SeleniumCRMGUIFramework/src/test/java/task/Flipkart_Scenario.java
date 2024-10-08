package task;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_Scenario
{
public static void main(String[] args) throws Throwable 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	WebElement fas = driver.findElement(By.xpath("//span[text()='Fashion']"));
	Actions act= new Actions(driver);
	act.moveToElement(fas).perform();
	List<WebElement> ele = driver.findElements(By.className("_1BJVlg"));
	List<WebElement> eles;
	FileInputStream fis=new FileInputStream("D:\\Tek Pyramid Trining\\Selenium\\DDT\\Excel\\Emt2.xlsx");
	Workbook wb= WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("sheet2");
	int i=1;
	for (WebElement webElement : ele) 
	{
		Thread.sleep(1000);
		sh.createRow(i++).createCell(0).setCellValue(webElement.getText());
		act.moveToElement(webElement).perform();
		eles= driver.findElements(By.className("_3490ry"));
		for (WebElement webElement2 : eles)
		{
			//System.out.println(webElement2.getText());
			sh.createRow(i++).createCell(0).setCellValue(webElement2.getText());
		}
	}	
    
	FileOutputStream fos=new FileOutputStream("D:\\Tek Pyramid Trining\\Selenium\\DDT\\Excel\\Emt2.xlsx");
	wb.write(fos);
	wb.close();
	driver.quit();
}
}
