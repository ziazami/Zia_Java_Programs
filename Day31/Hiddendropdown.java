package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddendropdown {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();  //PIM
		
		//clicking on job title
		driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		
		//capture all the options and find total
		List<WebElement> options = driver.findElements(By.xpath("//div[@role='option' and @class='oxd-select-option']//span"));
		System.out.println("Total select items" +options.size());
		
		for(WebElement item: options)
		{
			if(item.getText().equals("Software Engineer"))
			{
				item.click();
				break;
			}
		}
		
		
		
		
		

	}

}
