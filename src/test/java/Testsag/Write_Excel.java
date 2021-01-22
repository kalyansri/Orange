package Testsag;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Excel {
	public static void main(String[] args) {
	
try {
		
	    File file = new File("D:\\ecl sel\\ExcelGuru99Demo.xlsx");
	    FileInputStream fis = new FileInputStream(file);
	    
	    XSSFWorkbook wbk = new XSSFWorkbook(fis);
	    XSSFSheet sheet = wbk.getSheetAt(0);
	    
	    int rowcnt = sheet.getLastRowNum() +1;
	    String[] value = {"S", "SEVEN"};
	    String[] value1 = {"M", "Mia"};
	    
	    XSSFRow row = sheet.createRow(rowcnt);
	    
	    for(int i=0;i<2;i++)
	    {
	    	XSSFCell cell = row.createCell(i);
	    	cell.setCellValue(value[i]);
	    	cell.setCellValue(value1[i]);
	    }
	    
	    FileOutputStream fos = new FileOutputStream(file);
	    wbk.write(fos);
	    
	    fis.close();
	    fos.close();
	    wbk.close();
}
catch(Exception e)
{
	System.out.println(e);
}
}
}