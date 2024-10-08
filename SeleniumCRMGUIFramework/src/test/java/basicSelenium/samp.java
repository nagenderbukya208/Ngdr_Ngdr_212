package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class samp
{
	@Test
	public void disabled() throws Throwable
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//section[text()='Button']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Disabled']")).click();
	Thread.sleep(2000);
    driver.findElement(By.xpath("//button[text()='Yes']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[text()='No'])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='4']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='submit']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Submit']")).click();
	Thread.sleep(2000);
   driver.quit();
}
}
