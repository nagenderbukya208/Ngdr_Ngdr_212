package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mousehover 
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
				driver.findElement(By.xpath("//section[text()='Mouse Hover']")).click();
				Thread.sleep(2000);
				WebElement ele=driver.findElement(By.xpath("//img[contains(@src,'/assets/message-hint-J20Zlhln.png')]"));
				ele.click();
				Thread.sleep(2000);
				Actions act=new Actions(driver);
						act.moveToElement(ele);
			}		
}
