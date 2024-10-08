package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class PopupNotification_Scenarion
{
	//DefaultAlert
		@Test(priority = 1)
			public void defaultsAlert() throws Throwable
		    {
			ChromeOptions cop=new ChromeOptions();
			cop.addArguments("cop");
			WebDriver driver=new ChromeDriver(cop);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//section[text()='Popups']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//section[text()='Notifications']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Notification']")).click();
			Thread.sleep(2000);
			driver.quit();
		    }
}
