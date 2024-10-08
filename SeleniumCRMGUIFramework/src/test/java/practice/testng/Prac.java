package practice.testng;

import org.testng.annotations.Test;

public class Prac {
@Test(priority = 2,dependsOnMethods = "sample3")
public void sample1() {
	System.out.println("10");
}
@Test(priority = 2)
public void sample2() {
	System.out.println("20");
}
@Test(priority = 1,dependsOnMethods ="sample2" )
public void sample3() {
	System.out.println("30");
}
@Test(priority = 1)
public void sample4() {
	System.out.println("40");
}
}

