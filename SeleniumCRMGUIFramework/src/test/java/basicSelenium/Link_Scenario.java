package basicSelenium;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Link_Scenario 
{
//	//DefaultLink
	@Test
	public void defaultLink() throws Throwable
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//section[text()='Link']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Default Link']")).click();
	Thread.sleep(2000);
	List<WebElement> elements = driver.findElements(By.xpath("//a[@class='text-white hover:text-slate-300 text-[14px]']"));
	for(WebElement ele:elements)
	{
		Thread.sleep(1000);
		ele.click();
	}
	Set<String> windowHandles = driver.getWindowHandles();
	int i=0;
	for(String win:windowHandles)
	{
		Thread.sleep(1000);
		driver.switchTo().window(win);
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
	driver.quit();
  }
	}
	//LinkInNewTab
		@Test
		public void linkInNewTab() throws Throwable
		{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Link']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Link in New Tab']")).click();
		Thread.sleep(2000);
		List<WebElement> elements = driver.findElements(By.xpath("//a[@class='text-white hover:text-slate-300 text-[14px]']"));
		Thread.sleep(2000);
		for(WebElement ele:elements)
		{
			Thread.sleep(1000);
			ele.click();
		}
		Set<String> windowHandles = driver.getWindowHandles();
		int i=0;
		for(String win:windowHandles)
		{
			Thread.sleep(1000);
			driver.switchTo().window(win);
			Thread.sleep(2000);
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
		driver.quit();
      }

}
	}

