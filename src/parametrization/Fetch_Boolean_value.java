package parametrization;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Boolean_value {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\Shree\\Documents\\Book.xlsx");
		
	boolean Bool = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(1).getCell(0).getBooleanCellValue();
	System.out.println(Bool);
	}
	

}
