package Day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwaitdemo {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
		
		

	}

}
