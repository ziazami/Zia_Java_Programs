package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturelocation {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		
		WebElement logo = driver.findElement(By.xpath("//img[@title='OpenCart - Open Source Shopping Cart Solution']"));
		
		System.out.println("Location of the logo"+logo.getLocation()); //61,21
		
		Point loc = logo.getLocation();
		
		System.out.println("X-axis point is: "+loc.getX());//61
		System.out.println("Y axis location "+loc.getY());//21

	}

}
