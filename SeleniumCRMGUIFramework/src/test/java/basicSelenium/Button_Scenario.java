package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Button_Scenario 
{
	//DefaultClick
	@Test(priority = 1)
	public void defaultClick() throws Throwable
	{
  	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.xpath("//a[text()='Default Click']")).click();
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[text()='Yes'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='3']")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.quit();
	  }
	//RightClick
	@Test(priority = 2)
	public void rightClick() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();
		Thread.sleep(2000);
		WebElement rig=driver.findElement(By.xpath("(//button[text()='Right Click'])[1]"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.contextClick(rig).perform();
	   driver.findElement(By.xpath("//div[text()='Yes']")).click();
	   Thread.sleep(2000);
		WebElement rig2=driver.findElement(By.xpath("//button[@id='btn31']"));
		act.contextClick(rig2).perform();
		   driver.findElement(By.xpath("//div[text()='No']")).click();
			Thread.sleep(2000);
			WebElement rig3=driver.findElement(By.xpath("(//button[text()='Right Click'])[3]"));
			act.contextClick(rig3).perform();
			   driver.findElement(By.xpath("//div[text()='3']")).click();
				Thread.sleep(2000);
	   driver.quit();
	}
	//DoubleClick
		@Test(priority = 3)
		public void doubleClick() throws Throwable
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//section[text()='Button']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Double Click']")).click();
			Thread.sleep(2000);
		WebElement dou1=driver.findElement(By.xpath("(//button[text()='Yes'])[1]"));
		Actions act=new Actions(driver);
		act.doubleClick(dou1).perform();
		Thread.sleep(2000);
		WebElement dou2=driver.findElement(By.xpath("(//button[text()='No'])[2]"));
		act.doubleClick(dou2).perform();
		Thread.sleep(2000);
		WebElement dou3=driver.findElement(By.xpath("//button[text()='4']"));
		act.doubleClick(dou3).perform();
		Thread.sleep(2000);
		   driver.quit();
		}
// SubmitClick
		@Test(priority = 4)
		public void submitClick() throws Throwable
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//section[text()='Button']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Submit Click']")).click();
			Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='sat1']")).submit();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='prob2']")).submit();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='r5']")).submit();
		Thread.sleep(2000);
		   driver.quit();
		}
		// Disabled
		@Test(priority = 5)
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
