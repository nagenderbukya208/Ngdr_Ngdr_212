package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Synchronization
{
	//ProgressBar
		@Test(priority = 1)
		public void progressBar() throws Throwable
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
			driver.findElement(By.xpath("//section[text()='Synchronization']")).click();
			driver.findElement(By.xpath("//section[text()='Progress Bar']")).click();
			driver.findElement(By.xpath("//button[text()='Start']")).click();
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='100%']"))));
			driver.findElement(By.xpath("//button[text()='Reset']"));
			driver.quit();
		}
}
