package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Browsermethods {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(3000);
		
		driver.close();//closes current window
		//driver.quit();  // closes all windows
		

	}

}
