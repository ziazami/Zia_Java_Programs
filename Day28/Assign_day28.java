package Day28;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_day28 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class='wikipedia-input-box']/input")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@id= 'wikipedia-search-result-link']/a"));
		
		
		System.out.println("The number of links for given search is  : \t"+links.size());
		
		System.out.println("The text on each link are :\n");
		for( WebElement i: links)
		{
			System.out.println(i.getText());
			i.click();
		}
		
		Set<String> winid = driver.getWindowHandles();
		System.out.println("The window Handles are :\t"+winid);
		System.out.println("Number of windows open after clicking all the links : \t"+winid.size());
		
		
		for(String id:winid)
		{
			String title = driver.switchTo().window(id).getTitle();
			if (title .equals("Selenium in biology - Wikipedia"))
			driver.close();
		}
		winid =driver.getWindowHandles();
		System.out.println("After closing one window, total number of windows open:\t"+winid.size());
		
		//driver.quit();
		
		

	}

}
