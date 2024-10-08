package task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_Robot_SK {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement ele = driver.findElement(By.id("email"));
	//ele.sendKeys("nagender@123");
	/*
	 * Robot r= new Robot(); String s="nagenderBukya"; for (char c :
	 * s.toCharArray()) { int k=KeyEvent.getExtendedKeyCodeForChar(c);
	 * Thread.sleep(800); r.keyPress(k); r.keyRelease(k); }
	 */
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='nagender';", ele);
}
}
