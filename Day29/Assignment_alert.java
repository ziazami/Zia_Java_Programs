package Day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_alert {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mypage.rediff.com/login/dologin");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(4000);
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		Thread.sleep(2000);
		driver.close();
		

	}

}
