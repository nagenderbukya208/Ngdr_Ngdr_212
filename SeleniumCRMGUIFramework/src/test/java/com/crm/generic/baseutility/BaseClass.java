package com.crm.generic.baseutility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
@BeforeSuite
public void configBS() {
	System.out.println("===connect to DB, Report Config===");
}
@BeforeClass
public void configBC() {
	System.out.println("===Launch the Browser===");
}
@BeforeMethod
public void configBM() {
	System.out.println("===Login===");
}
@AfterMethod
public void configAM() {
	System.out.println("===Logout===");
}
@AfterClass
public void configAC() {
	System.out.println("===Close the Browser===");
}
@AfterSuite
public void configAS() {
	System.out.println("===Close To DB, Report Backup===");
}
}
