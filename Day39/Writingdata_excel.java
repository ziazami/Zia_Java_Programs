package Day39;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writingdata_excel {

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet =workbook.createSheet("data");
		XSSFRow row1 = sheet.createRow(0);
		    row1.createCell(0).setCellValue("1000");
		    row1.createCell(0).setCellValue("aswe");
		    row1.createCell(0).setCellValue("donkey");
		    
		    XSSFRow row2 = sheet.createRow(1);
		    row1.createCell(0).setCellValue("4000");
		    row1.createCell(0).setCellValue("dgdgd");
		    row1.createCell(0).setCellValue("maddyy");
		    
		    workbook.write(file);
		    workbook.close();
		    file.close();
		    
		    System.out.println("file created");
		
		
	}

}
