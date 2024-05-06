package Day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//form[@name='name5']//input[@name='mytext5']")).sendKeys("Automation practice");
		
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector("a['href=https://a9t9.com']")).click();
		//driver.findElement(By.cssSelector("a[href='https://a9t9.com']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();
		
		
		boolean bool = driver.findElement(By.xpath("//img[@alt='UI Vision by a9t9 software - Image-Driven Automation']")).isDisplayed();
		System.out.println(bool);
			
		

	}

}
