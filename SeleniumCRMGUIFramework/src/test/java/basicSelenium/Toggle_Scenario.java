package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Toggle_Scenario
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
		driver.findElement(By.xpath("//section[text()='Toggle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Default']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='relative bg-gray-300 rounded-full w-9 h-4 transition duration-300 ease-in-out'])[1]")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("(//span[@class='relative bg-gray-300 rounded-full w-9 h-4 transition duration-300 ease-in-out'])[2]")).click();
		//Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='relative bg-gray-300 rounded-full w-9 h-4 transition duration-300 ease-in-out'])[3]")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("(//span[@class='relative bg-gray-300 rounded-full w-9 h-4 transition duration-300 ease-in-out'])[4]")).click();
	//	Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
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
		driver.findElement(By.xpath("//a[text()='Disabled']")).click();
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
}
