package Day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentday29 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
	    driver.get("https://testautomationpractice.blogspot.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    
	    //radiobutton checking
	    WebElement radio_male =driver.findElement(By.xpath("//input[@id='male']"));
	    
	    if(radio_male .isSelected())
	    {
	    	System.out.println("Radio button already selected");
	    }else
	    	radio_male.click();
	    Thread.sleep(2000);
	    
	    List<WebElement> check1= driver.findElements(By.xpath("//input[@type='checkbox']"));
	    
	    for(int i=10;i<check1.size();i++)
	    {
	    	check1.get(i).click();
	    	Thread.sleep(3000);
	    }

	    driver.close();
	}

}
