package Day34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;



public class Actionsvsaction {

	@SuppressWarnings("restriction")
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
			
		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions act = new Actions(driver);
		
		//act.contextClick(button).build().perform();
		
		
		Action myact= act.contextClick(button).build();
		myact.perform();
		
	}

}
