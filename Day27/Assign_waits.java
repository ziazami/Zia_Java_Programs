package Day27;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign_waits {

	public static void main(String[] args)
	{
		//String mypath = System.getProperty("user.dir");
		//System.out.println(mypath);
		//System.setProperty("webdriver.chrome.driver",mypath+"\\Drivers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
       //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//explicit wait declaration
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(15));
		
	
		
		driver.get("https://google.com"); 
		driver.manage().window().maximize();
		
		
		
		
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		WebElement search_btn = mywait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		System.out.println("Done");
		driver.findElement(By.name("abcd")).click();
		
		driver.close();
		driver.quit();
		

	}

}
