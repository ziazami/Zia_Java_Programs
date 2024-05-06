package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardactions {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome to automation");
		Actions act = new Actions(driver);
		
		//ctrl+A
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		//ctrl+C
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		//Tab
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//Ctrl+V
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		
		WebElement compare = driver.findElement(By.xpath("//div[@class='compareButtonText']"));
		compare.click();
		
		WebElement text = driver.findElement(By.xpath("//span[@class='messageForUser']"));
		String abc = text.getText();
		System.out.println(abc);
		if(text.getText().equals("The two texts are identical"))
		{
			System.out.println("Test is pass");
		}
		else
		{
			System.out.println("Test is failed");
		}
	}

}
