package parametrization;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class String_data_fetching {
	public static void main(String[] args) throws Throwable {
		//create object of Fileinputstream class
        FileInputStream fis =new FileInputStream("C:\\Users\\Shree\\Documents\\Book.xlsx");
		
		// fetching data as admin
		
		String admin = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(admin);
	}

}
