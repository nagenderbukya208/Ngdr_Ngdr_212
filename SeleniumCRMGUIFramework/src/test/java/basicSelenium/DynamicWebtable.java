package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebtable
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
	driver.findElement(By.xpath("//a[text()='Dynamic Web Table']")).click();
WebElement price=driver.findElement(By.xpath("//th[text()='Apple iPhone']/../td[4]"));
System.out.println(price.getText());
driver.quit();
	

}
}
