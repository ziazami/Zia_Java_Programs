package Day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxeshandling {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
	    driver.get("https://testautomationpractice.blogspot.com/");
	    driver.manage().window().maximize();
	    //1)select 1 checkbox
	   // driver.findElement(By.xpath("//input[@id='sunday']")).click();
	    
	    // 2)select all checkboxes
	    List<WebElement> check1 = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	    
	   /* for(int i = 0; i<check1.size();i++)
	    {
	    	check1.get(i).click();
	    	
	    }*/
	    
	   /* for(WebElement checkbox: check1)
	    {
	    	checkbox.click()
	    }*/
	    
	    //3)select last 3 checkboxes = 7-3=4th pos
	   /* for(int i=4 ; i <check1.size();i++)
	    {
	    	check1.get(i).click();
	    }*/
	    //selecting first 3 items
	    for(int i=0;i<3;i++)
	    {
	    	check1.get(i).click();
	    }
	    
	    Thread.sleep(5000);
	    //unselecting
	    
	    for(int i=0;i<3;i++)
	    {
	    	if(check1.get(i).isSelected())
	    	{
	    	check1.get(i).click();
	    }
	    }
		driver.quit();
		
	}

}
