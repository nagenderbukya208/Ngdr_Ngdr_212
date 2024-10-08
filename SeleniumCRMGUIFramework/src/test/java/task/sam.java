package task;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sam 
{
public static void main(String[] args) 
{
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Phones");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
 //	List<WebElement> phones = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
//		List<WebElement> sponsored = driver.findElements(By.xpath("//div[@class='a-row a-spacing-micro']/../h2/a/span"));
//		List<WebElement> sponsored = driver.findElements(By.xpath("//span[contains(@class , 'aok-inline-')]/../../../../h2"));
		List<WebElement> sponsored = driver.findElements(By.xpath("//div[@data-cy='title-recipe' and not (contains(.,'Sponsored'))]"));
		
		
		for(WebElement phone : sponsored)
		{
				System.out.println(phone.getText());		
		}
		
		
	}

}
}
