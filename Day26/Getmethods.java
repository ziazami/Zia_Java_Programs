package Day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Getmethods {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//get
		System.out.println("Title of the page"+driver.getTitle());
		
		//get currentURL
		System.out.println("Title of the current page"+driver.getCurrentUrl());
		
		//page source
		//System.out.println("Page source..  : "+driver.getPageSource());
		
		String window_handle = driver.getWindowHandle();
		Thread.sleep(3000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(3000);
		
		Set<String> wid = driver.getWindowHandles();
		System.out.println(wid);
		
		//driver.findElement(By.name("username")).sendKeys("Admin");
		//driver.findElement(By.name("password")).sendKeys("admin123");
		//driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//driver.findElement(By.cssSelector("button[type='submit']")).click();
		//driver.close();
		//driver.quit();
		

	}

}
