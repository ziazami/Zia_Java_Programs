package Day27;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitdemo {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		//Fluent Wait Declaration
		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
				               .withTimeout(Duration.ofSeconds(30))
				               .pollingEvery(Duration.ofSeconds(5))
				               .ignoring(NoSuchElementException.class);
		
		
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		   WebElement txt = mywait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.cssSelector("input[placeholder='Username']"));
			     }
			   });

		
		txt.sendKeys("Admin");
		

	}

}
