package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBox_Scenario 
{
	//Default
	@Test(priority = 1)
	public void defaults() throws Throwable
    {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//section[text()='Check Box']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Default']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='domain1']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='mode2']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='mode5']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='submit']")).submit();
	Thread.sleep(2000);
	driver.quit();
	}
	//Selected
   @Test(priority = 2)
    public void selected() throws Throwable
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//section[text()='Check Box']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Selected']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='domain3']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='mode3']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='submit']")).submit();
	Thread.sleep(2000);
	driver.close();
	}
	//	Disabled
	@Test(priority = 3)
	public void disabled() throws Throwable
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//section[text()='Check Box']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Disabled']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='domain4']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='mode15']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='as6']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='subm']")).submit();
	Thread.sleep(2000);
	driver.quit();
	}

}
