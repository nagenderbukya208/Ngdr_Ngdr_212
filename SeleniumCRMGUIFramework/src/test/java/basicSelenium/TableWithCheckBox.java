package basicSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableWithCheckBox 
{
public static void main(String[] args) throws Throwable 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
	//Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Table With Checkbox']")).click();
	List<WebElement> allcheckbox= driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	for(WebElement check:allcheckbox)
	{
		check.click();
	}
}
}
