package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Xpathdemo {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demo.opencart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//xpath with single attribute
		//driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Tab");
		
		//multiple attribute
		driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Tab");
		
		// and operator
		driver.findElement(By.xpath("//input[@name='search'] and [@placeholder='Search']")).sendKeys("Tab");
		
		//or operator
		driver.findElement(By.xpath("//input[@name='search'] or [@placeholder='Search']")).sendKeys("Tab");
		
		//text() 
		driver.findElement(By.xpath("//a[text() = 'MacBook']")).click();
		
		//contains
		driver.findElement(By.xpath("//input[contains(@name, 'sea')]")).sendKeys("Mac");
		
		//starts with()
		driver.findElement(By.xpath("//input[starts-with(@type, 'te')]")).sendKeys("Mac");
		
		//chained xpath
		driver.findElement(By.xpath("//div[@id='logo']/a/img")).click();
		
		driver.close();
		

	}

}
