package practice.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateContact_DP_Test2 {
@Test(dataProvider = "getData")
public void createContactTest(String fn, String ln, long ph) {
	System.out.println("FirstName:" + fn + ", LastName:" + ln+ ", phoneNum:"+ ph);
}
@DataProvider
public Object[][] getData(){
	Object[][] objArr= new Object[3][3];
	objArr[0][0]="nag";
	objArr[0][1]="TE";
	objArr[0][2]=8074821878l;
	
	objArr[1][0]="Hari";
	objArr[1][1]="Dev";
	objArr[1][2]=7685821878l;
	
	objArr[2][0]="sathish";
	objArr[2][1]="Hr";
	objArr[2][2]=807443688l;
return objArr;
}
}
