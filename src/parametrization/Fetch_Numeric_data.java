package parametrization;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Numeric_data {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis =new FileInputStream("C:\\Users\\Shree\\Documents\\Book.xlsx");
		
		  
	double number= WorkbookFactory.create(fis).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
		  System.out.println(number);
	}

}
