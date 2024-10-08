package practice.testng;

import org.testng.annotations.Test;

public class OrderTest {
@Test
public void createOrderTest() {
	System.out.println("Ecexute createOrderTest==>208");
	String str=null;
	System.out.println(str.equals("208"));
}
@Test(dependsOnMethods = "createOrderTest")
public void billingAnOrderTest() {
	System.out.println("Ecexute billingAnOrderTest==>208");
}
}
