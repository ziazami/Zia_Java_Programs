package Day38;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Svg_element {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//will not work with standard xpaths
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/div/div[3]/button/svg")).click();
		//driver.findElement(By.xpath("//button[@title='Timesheets']//svg")).click();

		
		//special format of xpath for svg element
		WebElement assign_leave = driver.findElement(By.xpath("//button[@title='Assign Leave']//*[name()='svg']"));
		System.out.println(driver.findElement(By.xpath("//button[@title='Leave List']")).getText());
		assign_leave.click();
		
		 Thread.sleep(2000);
		 driver.navigate().back();
		 Thread.sleep(2000);
		 
		 WebElement leave_list = driver.findElement(By.xpath("//button[@title='Leave List']//*[name()='svg']"));
			System.out.println("Text"+leave_list.getText());
			leave_list.click();
			
	
	
	}

}
