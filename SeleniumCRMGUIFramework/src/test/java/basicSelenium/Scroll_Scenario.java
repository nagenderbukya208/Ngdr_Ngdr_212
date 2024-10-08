package basicSelenium;

import java.awt.Window;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll_Scenario 
{
	//In New Tab
	@Test(priority = 1)
		public void inNewTab() throws Throwable
	    {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/scroll?scenario=1");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/aside/div/div[2]/div/ul/div[4]/ul/li/a/section[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/aside/div/div[2]/div/ul/div[4]/ul/li/a/section[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
		Thread.sleep(2000);
		  String id= driver.getWindowHandle();
	       Set<String> allids=driver.getWindowHandles();
	       for (String string : allids) 
	       {
	    	if(!(id.equals(string)))
	        driver.switchTo().window(string);
		}
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(2000);
		WebElement end=driver.findElement(By.xpath("//input[@type='checkbox']"));
		js.executeScript("arguments[0].scrollIntoView(true)",end);
		driver.quit();
	   }
	//Horizontal
		@Test(priority = 2)
			public void horizontal() throws Throwable
		    {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoapps.qspiders.com/ui/scroll?scenario=1");
			Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\\\"root\\\"]/div/div[2]/aside/div/div[2]/div/ul/div[4]/ul/li/a/section[1]")).click();			
	        Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\\\"root\\\"]/div/div[2]/aside/div/div[2]/div/ul/div[4]/ul/li/a/section[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Horizontal']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
	        Thread.sleep(2000);
	       String id= driver.getWindowHandle();
	       Set<String> allids=driver.getWindowHandles();
	       for (String string : allids)
	       {
	    	   if(!(id.equals(string)))
	   	        driver.switchTo().window(string);
			}
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(200,0);");
		driver.quit();
     }
}