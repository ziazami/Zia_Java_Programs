package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliderdemo {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
     //min slider
		WebElement  minslider = driver.findElement(By.xpath("//span[1]"));
		System.out.println("Current location of min slider is"+minslider.getLocation());
		act.dragAndDropBy(minslider,100,249).perform();
		System.out.println("After dragging the location is "+minslider.getLocation());
		
		//max slider
		WebElement  maxslider = driver.findElement(By.xpath("//span[2]"));
		System.out.println("Maximum location of slider is "+maxslider.getLocation());
		act.dragAndDropBy(maxslider,-100,249).perform();
		System.out.println("After dragging the maxslider -  location is:  "+maxslider.getLocation());
		
		}

}
