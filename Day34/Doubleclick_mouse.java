package Day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick_mouse {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
				
		WebElement box1= driver.findElement(By.cssSelector("#field1"));
		WebElement box2 = driver.findElement(By.cssSelector("#field2"));
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		box1.clear();
		box1.sendKeys("Mamtha");
		
		Actions act = new Actions(driver);
		act.doubleClick(button).perform();
		
		String text = box2.getAttribute("value");  //extract text
		
		System.out.println("Extracted text from text2 : \t"+text);
		
		
		if(text.equals("Mamtha"))
		{
			System.out.println("Text is copied");
			
		}
		else
		{
			System.out.println("Text is not copied");
			
		}
				
				
		

	}

}
