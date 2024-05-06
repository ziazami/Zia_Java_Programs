package Day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertwithexplicitwait {

	public static void main(String[] args) throws InterruptedException
	{
		
		//Handle alert without switchTo().Alert()
		//by single explicit wait
		
		WebDriver driver = new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
	    Thread.sleep(5000);
	    
	    
	    
	    /* Alert myalert = driver.switchTo().Alert();
	     * System.out.println(myalert.getText());
	     * myalert.accept();
	     */
	    
	    WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(15));
	    
	    
	   Alert myalert = mywait.until(ExpectedConditions.alertIsPresent());
	    System.out.println(myalert.getText());
	     myalert.accept();
	      
	    
	    driver.close();
	    driver.quit();

	}

}
