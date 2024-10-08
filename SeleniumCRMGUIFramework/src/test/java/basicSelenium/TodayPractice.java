package basicSelenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TodayPractice {
	public static void main(String[] args) throws Throwable {
	FileInputStream fis= new FileInputStream("C:\\Users\\Dell\\Desktop\\Today.xlsx");
	   Workbook wb= WorkbookFactory.create(fis);
	 Sheet sh=wb.getSheet("sheet1");
	Row row= sh.createRow(2);
	Cell cel=row.createCell(3);
	cel.toString();
	cel.setCellValue("Ngdr");
	FileOutputStream fos= new FileOutputStream("C:\\Users\\Dell\\Desktop\\Today.xlsx");
	wb.write(fos);
	System.out.println("Done");
	wb.close();
	
	}
}
