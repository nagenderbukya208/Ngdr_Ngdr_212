package task;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_Sponsord
{
public static void main(String[] args) throws Throwable 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
	driver.findElement(By.id("nav-search-submit-button")).click();
	List<WebElement> phones= driver.findElements(By.xpath("//div[@data-cy='title-recipe' and not (contains(.,'Sponsored'))]"));
	FileInputStream fis=new FileInputStream("D:\\Tek Pyramid Trining\\Selenium\\DDT\\Excel\\Books.xlsx");
	Workbook wb= WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("sheet2");
	int i=0;
	for (WebElement ph: phones) 
	{
	  System.out.println(ph.getText());
      sh.createRow(i++).createCell(0).setCellValue(ph.getText());
	}
	FileOutputStream fos= new FileOutputStream("D:\\Tek Pyramid Trining\\Selenium\\DDT\\Excel\\Books.xlsx");
	wb.write(fos);
	wb.close();
	System.out.println("**Excecuted**");
	driver.quit();
}
}
