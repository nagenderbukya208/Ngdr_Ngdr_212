package task;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample_Task1 
{
public static void main(String[] args) throws IOException, InterruptedException 
{
	// Properties file
	  FileInputStream fis1=new FileInputStream("D:\\Tek Pyramid Trining\\Selenium\\DDT\\task1.properties"); 
	  Properties pobj=new Properties();
	  ArrayList<String> al=new ArrayList<String>();
	   pobj.load(fis1);
	   int size=pobj.size();
	   System.out.println(size);
	   for(int i=0;i<size;i++) {
		  String prop =pobj.getProperty("key"+i);
		  al.add(prop);
	   }
	   FileInputStream fis2=new FileInputStream("D:\\Tek Pyramid Trining\\Selenium\\DDT\\Excel\\task1.xlsx");
	   Workbook wb=WorkbookFactory.create(fis2);
	   Sheet sh=wb.getSheet("sheet1");
	   int rowcount=sh.getLastRowNum();
	   for(int i=0;i<=rowcount;i++) {
		   Row row=sh.getRow(i);
		   Cell cel=row.getCell(0);
		   String data=cel.getStringCellValue();
		   al.add(data);
	   }
	   System.out.println(al);
		wb.close();
		
		//write
		
		for(int i=0;i<al.size();i++) {
		FileInputStream fis3=new FileInputStream("D:\\Tek Pyramid Trining\\Selenium\\DDT\\Excel\\task1.xlsx");
		Workbook wb1=WorkbookFactory.create(fis3);
		Sheet sh1=wb1.getSheet("Sheet2");
		Row row1=sh1.createRow(i);
		Cell cel1=row1.createCell(0);
		cel1.setCellType(CellType.STRING);
		cel1.setCellValue(al.get(i));
		FileOutputStream fos=new FileOutputStream("D:\\Tek Pyramid Trining\\Selenium\\DDT\\Excel\\task1.xlsx");
		wb1.write(fos);
		wb1.close();
		}
		System.out.println("Done");
	}
}


