package Day23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cslocatordemo {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//tag#id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
		
		//tag.class
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Mac");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Mac");
		
		//tag[]attribute
		//driver.findElement(By.cssSelector("input[aria-label=\"Search store\"]")).sendKeys("pc");
		//driver.findElement(By.cssSelector("[aria-label=\"Search store\"]")).sendKeys("pc");
		
		//tag class attribute .[]
		driver.findElement(By.cssSelector("input.search-box-text[aria-label='Search store']")).sendKeys("laptops");
			
	   // driver.findElement(By.cssSelector(".search-box-text[aria-label='Search store']")).sendKeys("laptops");  
		
		
		
		
	}

}
