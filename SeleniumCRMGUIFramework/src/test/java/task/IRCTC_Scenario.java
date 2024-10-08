package task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class IRCTC_Scenario {
public static void main(String[] args) throws Throwable {
	ChromeOptions cop= new ChromeOptions();
	cop.addArguments("--disable-notifications");
	WebDriver driver= new ChromeDriver(cop);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("https://www.irctc.co.in/nget/train-search");
	WebElement from = driver.findElement(By.xpath("//input[@aria-controls='pr_id_1_list']"));
	from.sendKeys("HYEDERABAD");
	
	from.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	WebElement to = driver.findElement(By.xpath("//input[@aria-controls='pr_id_2_list']"));
	to.sendKeys("BENGALURU");
	to.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	 WebElement date = driver.findElement(By.xpath("//span[@class='ng-tns-c58-10 ui-calendar']"));
	 date.click();
	// WebElement type = driver.findElement(By.xpath("//span[text()='Sleeper (SL)']"));
      //  type.click();
	
}
}
