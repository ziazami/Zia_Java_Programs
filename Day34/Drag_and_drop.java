package Day34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		// rome---> italy
		WebElement stockholm = driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement denmark = driver.findElement(By.xpath("//div[@id='box104']"));
		
		act.dragAndDrop(stockholm, denmark).perform();
		
		//washington ---> united states
				WebElement washington=driver.findElement(By.xpath("//div[@id='box3']"));
				WebElement usa=driver.findElement(By.xpath("//div[@id='box103']"));
				
				act.dragAndDrop(washington, usa).perform();
				
				Thread.sleep(5000);
				
				driver.close();

	}

}
