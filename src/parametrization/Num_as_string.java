package parametrization;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Num_as_string {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\Shree\\Documents\\Book.xlsx");
		String value = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(value);
	}

}
 