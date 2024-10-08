package practice.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateContact_DP_Test {
@Test(dataProvider = "getData")
public void createContactTest(String fn, String ln) {
	System.out.println("FirstName:" + fn + ", LastName:" + ln);
}
@DataProvider
public Object[][] getData(){
	Object[][] objArr= new Object[3][2];
	objArr[0][0]="nag";
	objArr[0][1]="TE";
	
	objArr[1][0]="Hari";
	objArr[1][1]="Dev";
	
	objArr[2][0]="sathish";
	objArr[2][1]="Hr";
return objArr;
}
}
