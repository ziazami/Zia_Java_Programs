package Day39;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_dynamic_excel_data {

	public static void main(String[] args) throws IOException
	{
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile2.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Mydata");
		
		Scanner sc= new Scanner(System.in);
		for(int r=0;r<3;r++)
		{
			XSSFRow row1=sheet.createRow(r);
			for(int c=0;c<3;c++)
			{
				System.out.println("Enter Data");
				row1.createCell(c).setCellValue(sc.next());
			}
		}
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File is created");

	}

}
