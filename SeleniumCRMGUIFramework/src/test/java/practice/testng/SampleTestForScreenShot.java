package practice.testng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class SampleTestForScreenShot {
@Test
public void amazonTest() throws Throwable {
	WebDriver driver= new ChromeDriver();
	driver.get("http://amazon.com");
	//step-1 : Do typeCasting/DownCasting
	TakesScreenshot ts=(TakesScreenshot)driver;
	//step-2 : take screenshopt with the help of getScreenShotAs()
	File temp=ts.getScreenshotAs(OutputType.FILE);
	//step-3 : stroe it in permanent location
	File per=new File("./ScreenShot/SSTest.png");
	//copy from temp to perm
	FileHandler.copy(temp, per);
	driver.quit();
}
}
