package Day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_actions {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com");
		
		driver.manage().window().maximize();
		
		WebElement desktop = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']")); 
		Actions act = new Actions(driver);
		Thread.sleep(2000);		//act.moveToElement(desktop).moveToElement(mac).click().build().perform();
		act.moveToElement(desktop).moveToElement(mac).click().perform();
		driver.close();
	}

}
