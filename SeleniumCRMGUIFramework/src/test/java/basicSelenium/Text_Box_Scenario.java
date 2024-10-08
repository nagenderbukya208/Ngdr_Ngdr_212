package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.internal.invokers.AbstractParallelWorker.Arguments;

public class Text_Box_Scenario 
{
//WithPlaceHolder
@Test(priority = 1)
public void withPlaceHolder() throws Throwable
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//section[text()='Text Box']")).click();
	driver.findElement(By.xpath("//li[text()='With placeholder']")).click();
	// Register
	driver.findElement(By.name("name")).sendKeys("nagender");
	Thread.sleep(1000);
	driver.findElement(By.name("email")).sendKeys("nagender208@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.name("password")).sendKeys("n14500@208");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[text()='Register']")).click();
	Thread.sleep(1000);
	driver.quit();
  }
//withOutPlaceHolder
	@Test(priority = 2)
	public void withOutPlaceHolder() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Text Box']")).click();
		driver.findElement(By.xpath("//li[text()='Without placeholder']")).click();
		driver.findElement(By.name("name")).sendKeys("nagender");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("nagender208@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("n14500@208");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		Thread.sleep(1000);
        driver.quit();
    }
//WithToolTip
@Test(priority = 3)
public void withToolTip() throws Throwable
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//section[text()='Text Box']")).click();
	driver.findElement(By.xpath("//li[text()='With ToolTip']")).click();
	// Register
	driver.findElement(By.name("name")).sendKeys("nagender");
	Thread.sleep(1000);
	driver.findElement(By.name("email")).sendKeys("nagender208@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.name("password")).sendKeys("n14500@208");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[text()='Register']")).click();
	Thread.sleep(1000);
	driver.quit();
}
//MultilineTextArea
@Test(priority = 4)
public void multilineTextArea() throws Throwable
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//section[text()='Text Box']")).click();
	driver.findElement(By.xpath("//li[text()='Multiline Text Area']")).click();
	driver.findElement(By.name("name")).sendKeys("nagender");
	Thread.sleep(1000);
	driver.findElement(By.name("email")).sendKeys("nagender208@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.name("password")).sendKeys("n14500@208");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[text()='Register']")).click();
	Thread.sleep(1000);
	driver.quit();
}
//Disabled
@Test(priority = 5)
public void disabled() throws Throwable
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//section[text()='Text Box']")).click();
	driver.findElement(By.xpath("//li[text()='Disabled']")).click();
	WebElement name=driver.findElement(By.name("name"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='nagender'",name );
	Thread.sleep(1000);
	WebElement mail=driver.findElement(By.name("email"));
	js.executeScript("arguments[0].value='nagender208@gmail.com'",mail);
	Thread.sleep(1000);
	WebElement pass=driver.findElement(By.name("password"));
	js.executeScript("arguments[0].value='n14500@208'",pass);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[text()='Register']")).click();
	Thread.sleep(1000);
	driver.quit();
}
}

