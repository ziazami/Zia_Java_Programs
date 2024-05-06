package Day39;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readingexceldata {
	
	//excel file -->workbook-->Sheet--> rows --> cells

	public static void main(String[] args) throws IOException 
	{
	  FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data1.xlsx");
	  XSSFWorkbook workbook = new XSSFWorkbook(file);
	  XSSFSheet sheet = workbook.getSheet("sheet1");
	  
	  int tot_rows = sheet.getLastRowNum();
	  int tot_cells= sheet.getRow(0).getLastCellNum();
		
	  System.out.println("Total number of rows: "+tot_rows);
	  System.out.println("Total number of cells "+tot_cells);
	  
	  for(int r=0;r<tot_rows;r++)
	  {
		  XSSFRow current_row=sheet.getRow(r);
		  for(int c=0;c<tot_cells;c++)
		  {
			
			  XSSFCell current_cell= current_row.getCell(c);
			  System.out.println(current_cell.toString()+"\t");
		  }
		  System.out.println("\n");
	  }
	  
	  workbook.close();
	  file.close();
	}

}
