package Day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_day33 {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//driver.switchTo().frame(0);  //switch to frame
		
		String text1 = driver.findElement(By.xpath("//p[normalize-space()='Date:']")).getText();
		System.out.println(text1);
		
		//opens date picker
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String month = "August";
		String year = "2024";
		String date = "15";
		
		select_month_year(driver,month,year);
		select_date(driver,date);
		
		
		

	}
	static void select_month_year(WebDriver driver ,String month , String year)
	{
		while(true)
		{
			String current_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String current_year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(current_month.equals("August") && (current_year.equals("2025")))
					{
						break;
					}
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
					
				
					
				
					
		}
		
	}

	static void select_date(WebDriver driver , String date)
	{
		
	}
}
