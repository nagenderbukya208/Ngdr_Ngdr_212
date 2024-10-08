package task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_JS {
public static void main(String[] args) throws Throwable  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	WebElement dis = driver.findElement(By.xpath("//button[@class='btn btn-info btn-flat']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("arguments[0].scrollIntoView(false)", ele);
	//js.executeScript("window.scrollTo(0,1000)");
	Object object = js.executeScript("arguments[0].click()",dis);
	System.out.println(object);
	Thread.sleep(5000);
	driver.quit();
}
}
