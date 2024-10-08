package practice.datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
		FileInputStream fis=new FileInputStream("D:\\Tek Pyramid Trining\\Selenium\\DDT\\Excel\\Org.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("sheet2");
          int rowcount= sh.getLastRowNum();
		for(int i=1; i<=rowcount;i++)
		{
			Row row= sh.getRow(i);
		String colunm1data = row.getCell(0).toString();
		String column2data = row.getCell(1).toString();
		System.out.println(colunm1data +"\t" + column2data);
		}
		wb.close();
}
}
