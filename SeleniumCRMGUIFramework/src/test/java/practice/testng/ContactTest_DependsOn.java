package practice.testng;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ContactTest_DependsOn {
@Test()
public void createContactTest() {
	System.out.println("execute contact test==>HDFC");
}
@Test(dependsOnMethods = "createContactTest")
public void modifyContactTest() {
	System.out.println("execute modifyContactTest==>HDFC->ICICI");
}
@Test(dependsOnMethods = "modifyContactTest")
public void deletContactTest() {
	System.out.println("execute deleteContactTest ICICI");
}
}
