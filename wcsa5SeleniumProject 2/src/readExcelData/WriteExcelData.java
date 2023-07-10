package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {

			
		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			
			//Write the data in Excel Sheet
			
			FileInputStream fis = new FileInputStream("./data/TestData.xlsx.xlsx"); 
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet("IPL");
			Row row = sheet.createRow(11); //create the row using Row(I)
			Cell cell = row.createCell(0); //create the cell using cell(I)
		
			cell.setCellValue("Pune"); 
			
			FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx.xlsx");
			wb.write(fos);
		}

	}


