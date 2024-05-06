package Day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertshandling {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
	    driver.get("https://testautomationpractice.blogspot.com/");
	    driver.manage().window().maximize();
	    
	    //normal alert with ok button
	    driver.findElement(By.xpath("//button[normalize-space()='Alert']"));
	    Alert myalert = driver.switchTo().alert();
	    System.out.println(myalert.getText());
	    myalert.accept();
	    
	    
	    //confirmation alert - ok - cancel
	   /* driver.findElement(By.xpath("//button[normalize-space()='Confirm Box']"));
	    Thread.sleep(3000);
	     //driver.switchTo().alert().accept();
	     driver.switchTo().alert().dismiss();*/
	    
	     //prompt alert - input box
	    /* driver.findElement(By.xpath("//button[normalize-space()='Prompt']"));
	     Alert myalert2 = driver.switchTo().alert();
	     Thread.sleep(3000);
	     myalert2.sendKeys("welcome");
	     Thread.sleep(3000);
	     myalert2.accept();*/
	     driver.close();
	    
	}

}
