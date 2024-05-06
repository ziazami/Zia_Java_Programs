package Day36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Open_link_new_tab {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		WebElement register = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		Actions act = new Actions(driver);
		
		 // Simulating hold down the Control/Command key while clicking the link
		act.keyDown(Keys.CONTROL).click(register).keyUp(Keys.CONTROL).perform();
		
		List<String> winid = new ArrayList(driver.getWindowHandles());
		//switching to 2nd window
		driver.switchTo().window(winid.get(1));
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Tommy");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Smith");
		
		WebElement dob_day = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
		Select select1 = new Select(dob_day);
		select1.selectByIndex(30);
				
		WebElement dob_month = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
		Select select2 = new Select(dob_month);
		select2.selectByVisibleText("August");
		
		
		WebElement dob_year = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
		Select select3 = new Select(dob_year);
		select3.selectByValue("2009");
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("abcxyz123798@gmail.com");
		
		WebElement newsletter = driver.findElement(By.xpath("//input[@id='Newsletter']"));
		if(newsletter.isSelected())
		{
			newsletter.click();
		}
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='Password']"));
		pwd.sendKeys("xyzabc");
		Thread.sleep(2000);
		String txt1= pwd.getText();
		System.out.println(txt1);
		
		WebElement confirm_pwd = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		confirm_pwd.sendKeys("xyzabc");
		Thread.sleep(2000);
		String txt2= confirm_pwd.getText();
		System.out.println(txt2);
		
		driver.findElement(By.xpath("//button[@id='register-button']")).click();
		
		if(txt1 == txt2)
		{
			driver.findElement(By.xpath("//button[@id='register-button']")).click();
		}
		else
		{
			System.out.println("passwords mismatch! - retype  password");
		}
		
	}

}
