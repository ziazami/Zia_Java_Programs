package Day33;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker_eg 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0); // switch to frame
		
		//Method-1--using sendKeys(
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("01/15/2024");
		
		//Method-2--using date picker
		String year="2023";
		String month = "August";
		String date = "19";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();//opens date picker
		selectmonthandyear(driver,month,year); //select month and year
		dates(driver,date); //select date
		
	}
		
	static void selectmonthandyear(WebDriver driver , String month , String year)
	{
		//select month and year
		while(true)
		{
			
			String current_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String  current_year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(current_month .equals (month) && current_year .equals (year))
			{
				break;
			}
				
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			
		}
	}
	
	
	static void dates(WebDriver driver, String date)
	{
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement dt: alldates)
		{
			if(dt.getText().equals (date))
			{
				dt.click();
				break;
			}
			
		}

	}

	}


