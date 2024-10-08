package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Radio_Scenario
{
	//Default
		@Test(priority = 1)
		public void defaults() throws Throwable
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//section[text()='Radio Button']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[text()='Default']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='attended4']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='willing1']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@id='btn']")).submit();
			Thread.sleep(1000);
			driver.close();
		}
		//Selected
		@Test(priority = 2)
		public void selected() throws Throwable
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//section[text()='Radio Button']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[text()='Selected']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='attended54']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='attended50']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='willing7']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()='Continue']")).submit();
			Thread.sleep(1000);
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("//section[text()='Radio Button']")).click();
				Thread.sleep(1000);
			driver.findElement(By.xpath("//a[text()='Disabled']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='attended31']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='attended36']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='willing22']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()='Continue']")).submit();
			Thread.sleep(1000);
			driver.quit();

		}
}
