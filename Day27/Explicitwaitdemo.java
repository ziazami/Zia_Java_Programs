package Day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaitdemo {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		//declaration of explicit wait
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement txt = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Username']")));
		txt.sendKeys("Admin");
		
		WebElement pwd = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Password']")));
		pwd.sendKeys("admin123");
		
		WebElement login = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[type='submit']")));
		login.click();
		System.out.println("Login successful");
		
		driver.close();
		
		

	}

}
