package Day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_table {

	public static void main(String[] args) 
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	//1) find total number of rows
	 int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	//int rows = driver.findElements(By.tagName("tr")).size();  // preferable only if 1 webtable is present
    //System.out.println("Total number of rows  : \t"+rows);
    
    //2) find total number of columns in a table
      int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
   // int columns = driver.findElements(By.tagName("th")).size();
   // System.out.println("Total number of columns  : \t"+columns);
    
    //extracing a specific cell in a table
    String book_name = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
   // System.out.println("Book name : \t"+book_name);
    
    //read all data table
   // System.out.println("Book Name"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price"+"\t");
    /*for(int r=2 ;r<=rows;r++)
    {
    	for(int c=1;c<=columns;c++)
    	{
    		
    		String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
    	    System.out.println(""+value+"\t");
    	    
    	}
    	System.out.println();
    }*/
    
    //conditional retrieval
    for(int r=2;r<=rows;r++)
    {
    	 String author_name = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
    	// System.out.println(book_name);
    	 if(author_name .equals("Mukesh"))
    			 {
    			 String book_name1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
    			 System.out.println(book_name1);
    			 }
    }
    
    //Total price for all books
    int total = 0;
    for(int r=2;r<=rows ;r++)
    {
    	String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
    	System.out.println(price);
    	total= total + Integer.parseInt(price);
    }
    System.out.println("Total price of all books :\t"+total);//7100
    driver.quit();
	}

}
