package Day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframedemo {

	public static void main(String[] args) throws InterruptedException
	{
		
      WebDriver driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.manage().window().maximize();
      driver.get("https://ui.vision/demo/webtest/frames");
      
      //frame1
      WebElement frame1 =  driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
      driver.switchTo().frame(frame1);
      driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
      
      //frame2
      driver.switchTo().defaultContent();
      WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
      driver.switchTo().frame(frame2);
      driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium - Java");
      Thread.sleep(2000);
      
      //frame3
      driver.switchTo().defaultContent();
      WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
      driver.switchTo().frame(frame3);
      driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("welcome to automation");
      Thread.sleep(2000);
      
      //innerframe
      driver.switchTo().frame(0);
      driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
    //  JavascriptExecutor js=(JavascriptExecutor)driver;
    //  js.executeScript("arguments[0].click;", element);  
      
      
      //frame4
      driver.switchTo().defaultContent();
      WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
      driver.switchTo().frame(frame4);
      driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("welcome to manual testing");
      Thread.sleep(2000);
     
      
	}

}
