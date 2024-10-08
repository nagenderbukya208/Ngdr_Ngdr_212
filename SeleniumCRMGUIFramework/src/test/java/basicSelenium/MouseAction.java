package basicSelenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseAction 
{
	//DragAndDrop
		@Test(priority = 1)
		public void dragAndDrop() throws Throwable
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
			Thread.sleep(2000);
			WebElement mobile=driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
			mobile.click();
			WebElement mobacc=driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
			mobacc.click();
			Actions act=new Actions(driver);
			act.dragAndDrop(mobile,mobacc).perform();
			Thread.sleep(3000);
			driver.quit();
		}
		//DragAndDropMultiple
				@Test(priority = 2)
				public void dragAndDropMultiple() throws Throwable
				{
					WebDriver driver=new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//a[text()='Drag Multiple']")).click();
					Thread.sleep(2000);
					WebElement laptop=driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
					WebElement mobcha=driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
					Robot r= new Robot();
					r.keyPress(KeyEvent.VK_CONTROL);
					laptop.click();
					mobcha.click();
					WebElement mobacc=driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
					Actions act=new Actions(driver);
					act.dragAndDrop(mobcha, mobacc).perform();
					r.keyRelease(KeyEvent.VK_CONTROL);
					Thread.sleep(3000);
					driver.quit();
				}
}
					

