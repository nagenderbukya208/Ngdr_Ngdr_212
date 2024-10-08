package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames 
{
	//DefaultFrame
	@Test
	public void iframeLogin() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("username")).sendKeys("nagender");
		driver.findElement(By.id("password")).sendKeys("14500208");
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(1000);
		driver.quit();
	}
//	//NestedFrame
		@Test
		public void nestedFrame() throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//section[text()='Frames']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//section[text()='iframes']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Nested iframe']")).click();
			Thread.sleep(2000);
			driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
			Thread.sleep(2000);
			driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nagender208@gmail.com");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("14500208");
			driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys("14500208");
			driver.findElement(By.xpath("//button[@id='submitButton']")).click();
			Thread.sleep(3000);
			driver.quit();
		}
		//NestedMulFrame
	@Test
	public void nestedMulFrame() throws InterruptedException
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//section[text()='Frames']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//section[text()='iframes']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Nested with Multiple iframe']")).click();
	Thread.sleep(2000);
	driver.switchTo().frame(0);
String email=driver.findElement(By.xpath("//p[text()='Admin@gmail.com']")).getText();
String pass=driver.findElement(By.xpath("(//p[text()='Admin@1234'])[1]")).getText();
String cpass=driver.findElement(By.xpath("(//p[text()='Admin@1234'])[2]")).getText();
Thread.sleep(2000);
driver.switchTo().frame(0);
driver.switchTo().frame(0);
driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
driver.switchTo().parentFrame();
driver.switchTo().frame(1);
driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
driver.switchTo().parentFrame();
driver.switchTo().frame(2);
driver.findElement(By.xpath("//input[@id='confirm']")).sendKeys(cpass);
driver.switchTo().parentFrame();
driver.switchTo().frame(3);
driver.findElement(By.xpath("//button[@id='submitButton']")).click();
Thread.sleep(2000);
driver.quit();

   }
}