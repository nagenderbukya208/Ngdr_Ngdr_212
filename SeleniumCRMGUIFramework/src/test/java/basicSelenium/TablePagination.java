package basicSelenium;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TablePagination 
{
public static void main(String[] args) throws Throwable 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
	driver.findElement(By.xpath("//a[text()='Table Pagination']")).click();

	int page=1;
//	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
	//	wait.until(ExpectedConditions.visibilityOf(null))
	Thread.sleep(2000);
	while(page<=3)
	{
		List<WebElement> allpro=driver.findElements(By.xpath("//th[@class='px-6 py-4 font-medium text-gray-900 whitespace-nowrap']"));
		for(WebElement pro:allpro)
			System.out.println(pro.getText());
		page++;
	//	wait.until(ExpectedConditions.visibilityOf(null))
		Thread.sleep(2000);
		if(page==2)
			driver.findElement(By.xpath("//li[text()='2']")).click();	
		if(page==3)
			driver.findElement(By.xpath("//li[text()='3']")).click();
	}
	
	
driver.quit();
}
}
