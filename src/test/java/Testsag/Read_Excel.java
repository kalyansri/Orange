package Testsag;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel {
	
	public static void main(String[] args) {
		try {
		
	    File file = new File("D:\\ecl sel\\ExcelGuru99Demo.xlsx");
	    FileInputStream fis = new FileInputStream(file);
	    
	    XSSFWorkbook wbk = new XSSFWorkbook(fis);
	    XSSFSheet sheet = wbk.getSheetAt(0);
	    
	    int rowcnt = sheet.getLastRowNum() +1;
	    
	    for(int i=0;i<rowcnt;i++)
	    {
	    	XSSFRow row = sheet.getRow(i);
	    	for(int j=0;j<row.getLastCellNum();j++)
	    	{
	    		System.out.println(row.getCell(j) + "|");
	    	}
	    	System.out.println();
	    	}
	    fis.close();
	    wbk.close();
	    }
		catch(Exception e)
		{
			System.out.println(e);
		}
	    }
}