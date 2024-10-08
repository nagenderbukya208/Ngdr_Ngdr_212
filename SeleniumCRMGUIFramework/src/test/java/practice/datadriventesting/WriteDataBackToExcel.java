package practice.datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataBackToExcel 
{
public static void main(String[] args) throws Throwable 
{
	FileInputStream fis=new FileInputStream("D:\\Tek Pyramid Trining\\Selenium\\DDT\\Excel\\Books.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("sheet2");
	Row row=sh.getRow(1);
	//int countcel=row.getLastCellNum();
	//for(int i=2; i<=countcel;i++)
//	{
	Cell cel=row.createCell(2);
	cel.setCellType(CellType.STRING);
	cel.setCellValue("SRPT");
	FileOutputStream fos=new FileOutputStream("D:\\Tek Pyramid Trining\\Selenium\\DDT\\Excel\\Books.xlsx");
	wb.write(fos);
	wb.close();
	System.out.println("***Excecuted***");
}
}
//}
