package practice.testng;

import org.testng.annotations.Test;

public class ContactTest {
@Test(priority = 1)
public void createContact() {
	System.out.println("execute contact test");
}
@Test(priority = 2)
public void modifyContactTest() {
	System.out.println("execute modifyContactTest");
}
@Test(priority = 3)
public void deletContactTest() {
	System.out.println("execute deleteContactTest");
}
}
