package DataDrivenTesting;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Basic_FetchingDataFromExcel {
	public static void main(String[] args) throws Exception {
		
	FileInputStream fis=new FileInputStream(".\\NewSS\\Nitin.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("Sheet1");
	
	
	int rowCount=sh.getLastRowNum();
	
	System.out.println(rowCount);
	
	for(int i=1; i<rowCount; i++) {
		Row row=sh.getRow(i);
		String cell1=row.getCell(0).toString();
		String cell2=row.getCell(1).toString();
		String cell3=row.getCell(2).toString();
		
		System.out.println(cell1+"\t"+cell2+"\t"+cell3);
	}
wb.close();
	}

}
