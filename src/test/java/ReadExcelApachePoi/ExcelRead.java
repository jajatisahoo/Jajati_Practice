package ReadExcelApachePoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelRead {
	public static void main(String[] args) throws IOException {
		
		File file=new File("F:\\Selenium_Accenture_ST\\MyData.xlsx");
		FileInputStream ins=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(ins);
		XSSFSheet guru99Sheet=wb.getSheetAt(0);
		//String data=sheet.getRow(1).getCell(0).getStringCellValue();
		int rowCount=guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();
		//Create a loop over all the rows of excel file to read it

	    for (int i = 0; i < rowCount+1; i++) {

	        Row row = guru99Sheet.getRow(i);

	        //Create a loop to print cell values in a row

	        for (int j = 0; j < row.getLastCellNum(); j++) {

	            //Print Excel data in console

	            System.out.print(row.getCell(j).getStringCellValue()+"|| ");

	        }

		
	}
	

	}
}
