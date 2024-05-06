package Day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign_32 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://blazedemo.com");
		driver.manage().window().maximize();
		
		WebElement depart = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select select1 = new Select(depart);
		select1.selectByValue("Boston");
		Thread.sleep(2000);
		
		WebElement dest = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select select2 = new Select(dest);
		select2.selectByValue("New York");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
		int rows = driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
		System.out.println("Number of rows in the table:\t"+rows);
		
		for(int r=2;r<=rows;r++)
		{
		String price = driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]//td[6]")).getText();
		}
		Thread.sleep(2000);
		driver.quit();

	}

}
