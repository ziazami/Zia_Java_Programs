package Day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign_2_drag_anddrop {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement source1= driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
		WebElement target1 = driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		WebElement source2 = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		WebElement target2 = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source1, target1).perform();
		act.dragAndDrop(source2, target2).perform();
		
		WebElement source3= driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
		WebElement target3 = driver.findElement(By.xpath("//ol[@id='amt8']//li[@class='placeholder']"));
		WebElement source4 = driver.findElement(By.xpath("//a[normalize-space()='SALES']"));
		WebElement target4 = driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));
		
		act.dragAndDrop(source3, target3).perform();
		act.dragAndDrop(source4, target4).perform();
		
		Thread.sleep(4000);
		
		

	}

}
