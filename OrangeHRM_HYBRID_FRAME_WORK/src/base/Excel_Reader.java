package base;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Reader extends baseScript
{
	public static String data(String sheetname,int row1, int cell1) throws EncryptedDocumentException, IOException
	{
	
	    FileInputStream fis = new FileInputStream(path_of_excel_file);
		Workbook book = WorkbookFactory.create(fis);
		Cell cell = book.getSheet(sheetname).getRow(row1).getCell(cell1);
		String val = cell.getStringCellValue();
		return val;
	}

}
