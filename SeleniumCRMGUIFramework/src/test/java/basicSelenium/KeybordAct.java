package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KeybordAct 
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
		driver.findElement(By.xpath("//section[text()='Keyboard Actions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Keyboard']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nagender212@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("N14500@208n");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("N14500@208n");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Press Enter to Submit']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
