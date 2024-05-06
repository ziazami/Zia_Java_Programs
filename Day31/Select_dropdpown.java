package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_dropdpown {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		WebElement element = driver.findElement(By.xpath("//select[@id='country']"));
		Select select = new Select(element);
		
		//1) select option from dropdown
		select.selectByVisibleText("India");
		Thread.sleep(2000);
		
		//by value attr
		select.selectByValue("france");
		Thread.sleep(2000);
		
		select.selectByIndex(3);  //germany
		Thread.sleep(2000);
		
		//2)capture all options and find total
		List<WebElement> options = select.getOptions();
		System.out.println(options.size());
		
	
		
	}

}
