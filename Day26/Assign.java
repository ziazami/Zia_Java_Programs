package Day26;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assign {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//get Title()
		System.out.println("Page Title is :\t"+driver.getTitle());  // Your store
		
		//getCurrentURL
		System.out.println("The current URL is  :\t"+driver.getCurrentUrl());  
		
		//System.out.println("The page source code is  :\n "+driver.getPageSource());
		
		//getwindowhandle()
		String wid= driver.getWindowHandle();
		System.out.println("The window handle id is : \t"+wid);
		
		//isDisplayed
		boolean logo = driver.findElement(By.xpath("//img[@title='Your Store']")).isDisplayed();
		System.out.println("Status of Logo display  :\t"+logo);
		
		
		//isEnabled()
		boolean bool = driver.findElement(By.xpath("//span[normalize-space()='My Account']")).isEnabled();
		System.out.println("Staus of My account if Enabled  : \t"+bool);
		
		WebElement account = driver.findElement(By.xpath("//span[normalize-space()='My Account']"));
		account.click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		Thread.sleep(2000);
		
		//isSElected()
		boolean subsc_yes = driver.findElement(By.xpath("//input[@id='input-newsletter-yes']")).isSelected();
		System.out.println("Status of Subscribe - Yes option : \t"+subsc_yes);
		
		boolean subsc_no = driver.findElement(By.xpath("//input[@id='input-newsletter-no']")).isSelected();
		System.out.println("Status of Subscribe- No option : \t"+subsc_no);
		
		
		driver.close();
		
	}

}
