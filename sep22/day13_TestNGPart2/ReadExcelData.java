package sep22.day13_TestNGPart2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelData {
	
	public String[][] fetchData() throws IOException
	{
		//Step1: Accessing the Workbook
		XSSFWorkbook workBook = new XSSFWorkbook("./datasep22/myinfo.xlsx");
		
		//Step2:Access the WorkSheet
		XSSFSheet workSheet = workBook.getSheet("Sheet1");
		
		//Step3: Get the Last Row where the data exist in the WorkSheet
		int lastRow = workSheet.getLastRowNum();
		
		//Step4: Get the last Column by access one of the Row
		short lastColumn = workSheet.getRow(1).getLastCellNum();
		
		
		String[][] data = new String[lastRow][lastColumn];
		for(int row=1; row<lastRow; row++)
		{
			for (int col=0; col<lastColumn; col++)
			{
				String stringCellValue = workSheet.getRow(row).getCell(col).getStringCellValue();
				System.out.println(stringCellValue);
				
				
				data[row-1][col]=stringCellValue;
				
			}
		}
		
		workBook.close();
		return data;
		
	}

}
