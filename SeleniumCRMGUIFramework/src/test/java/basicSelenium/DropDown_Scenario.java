package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown_Scenario
{
	//SingleSelectDD
	@Test(priority = 1)
	public void singleSelectDD() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Single Select']")).click();
		WebElement ph=driver.findElement(By.xpath("//input[@id='phone']"));
		Thread.sleep(2000);
		ph.sendKeys("9951328514");
		Thread.sleep(2000);
		WebElement DD = driver.findElement(By.xpath("//select[@id='select3']"));
		Select sel=new Select(DD);
		System.out.println(sel.isMultiple());
		sel.selectByIndex(1);
		Thread.sleep(2000);
		driver.quit();
	}
}
