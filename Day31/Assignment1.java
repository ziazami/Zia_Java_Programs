package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/\r\n");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//select[@id='country-list']")).click();
		List<WebElement> options = driver.findElements(By.xpath("//select[@name='country']//option"));
		System.out.println(options.size());
		
		for(WebElement ele:options)
		{
			System.out.println(ele.getText());
			if(ele.getText() .equals("China"))
				ele.click();
		}
	}

}
