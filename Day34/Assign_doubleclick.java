package Day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_doubleclick {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		
		WebElement box1= driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		box1.clear();
		box2.sendKeys("automation");
		button.click();
		
		String text1 = box2.getAttribute("value");
		
		if(text1.equals("automation"))
		{
			System.out.println("Text is successfully copied !");
		}
		else 
		{
			System.out.println("Text copy fail.");
		}
		Thread.sleep(3000);
		driver.close();
				

	}

}
