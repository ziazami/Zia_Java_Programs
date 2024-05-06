package Day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_day30 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.switchTo().frame(0);  //inner frame
		WebElement logo = driver.findElement(By.xpath("//span[@class='XQLyQ']"));
		Thread.sleep(3000);
		if(logo.isDisplayed())
			System.out.println("Logo -presence Passed");
		else 
			System.out.println("Logo presence test Failed");
		
		driver.switchTo().defaultContent();
		driver.close();

	}

}
