package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//List<WebElement> element = driver.findElements(By.xpath("//select[@id='colors']//option"));
		//System.out.println(element.size());
		
		driver.findElement(By.xpath("//option[@value='green']")).click();
		
	}

}
