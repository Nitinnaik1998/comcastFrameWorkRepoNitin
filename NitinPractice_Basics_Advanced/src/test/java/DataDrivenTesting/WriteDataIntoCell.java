package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoCell {
	public static void main(String[] args) throws Exception {
		
	FileInputStream fis=new FileInputStream(".\\NewSS\\Nitin.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("Sheet2");
    for(int i=0; i<10; i++) {
    	Row row1=sh.getRow(0);
    	Cell cell=row1.createCell(i);
    	cell.setCellType(CellType.STRING);
    	cell.setCellValue("TC_NO");
    	
    }
	FileOutputStream fos=new FileOutputStream(".\\NewSS\\Nitin.xlsx");
	wb.write(fos);
	wb.close();
	System.out.println("+++EXECUTED+++");
	}

}
