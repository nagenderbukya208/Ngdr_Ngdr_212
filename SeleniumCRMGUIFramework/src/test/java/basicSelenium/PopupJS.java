package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopupJS
{
	//DefaultAlert
	@Test(priority = 1)
		public void defaultsAlert() throws Throwable
	    {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Default Alert']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Thread.sleep(2000);
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.quit();
	    }
		//Confirm
		@Test(priority = 2)
		public void confirm() throws Throwable
			    {
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//section[text()='Popups']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//section[text()='Javascript']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[text()='Confirm']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
				Thread.sleep(2000);
				Alert alert=driver.switchTo().alert();
				System.out.println(alert);
				alert.dismiss();
				Thread.sleep(2000);
				driver.quit();
			    }
		//Prompt
		@Test(priority = 3)
			public void prompt() throws Throwable
		    {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//section[text()='Popups']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//section[text()='Javascript']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Prompt']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
			Thread.sleep(2000);
			Alert prompt=driver.switchTo().alert();
			System.out.println(prompt.getText());
			prompt.sendKeys("yes");
			Thread.sleep(2000);
			prompt.accept();
			driver.quit();
		    }	
   }
