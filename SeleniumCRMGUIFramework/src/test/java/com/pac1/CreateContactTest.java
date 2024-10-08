package com.pac1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CreateContactTest {
	@BeforeSuite
	public void configurBeforeSuite() {
		System.out.println("BS");
	}
	@BeforeClass
	public void configurBeforeClass() {
		System.out.println("BC");
	}
	@BeforeMethod
	public void configurBeforeMethod() {
		System.out.println("BM");
	}
@Test
public void createContact() {
	System.out.println("createContact");
}
@Test
public void createContactDate() {
	System.out.println("createContactWithDate");
}
@AfterMethod
public void configurAfterMethod() {
	System.out.println("AM");
}
@AfterClass
public void configurAfterClass() {
	
System.out.println("AC");
}
@AfterSuite
public void configurAfterSuite() {
	System.out.println("AS");
}
}
