package practice.hometest;

import static org.testng.Assert.assertEquals;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePageSampleTest {
	@Test
	public void homepagetest(Method mtd) {
		Reporter.log(mtd.getName() + "Test Start");
		SoftAssert sa= new SoftAssert();
		Reporter.log("step-1",true);
		Reporter.log("step-2",true);
		// Hard Assert
		Assert.assertEquals("Home", "Home");
		Reporter.log("step-3",true);
		//Soft Assert
		sa.assertEquals("title", "title");
		Reporter.log("step-4",true);
		sa.assertAll();
		Reporter.log(mtd.getName() + "Test End");
	}

	@Test
	public void verifyLogoHomePage(Method mtd) {
		Reporter.log(mtd.getName() + "Test Start");
		SoftAssert sa= new SoftAssert();
		Reporter.log("step-1",true);
		Reporter.log("step-2",true);
		sa.assertTrue(true);
		Reporter.log("step-3",true);
		Reporter.log("step-4",true);
		sa.assertAll();
		Reporter.log(mtd.getName() + "Test End");
		
	}
}
