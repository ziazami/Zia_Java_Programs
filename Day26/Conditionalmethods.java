package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Conditionalmethods {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//isDisplayed()
		boolean bool =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println("Display status of logo  :"+bool);
		boolean bool1 =driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isEnabled();
		System.out.println("Enabled  status of logo  :"+bool1);
		boolean bool3 = driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
		System.out.println("Enable status of search box  : "+bool3);
		boolean male_rd =driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();
		boolean female_rd =driver.findElement(By.xpath("//input[@id='gender-female']")).isSelected();
		
		//Before Selectection
		System.out.println("Before Selection...");
		System.out.println("Male  "+male_rd+"\nFemale: "+female_rd);
		
		//After Selection
		System.out.println("After selection  :");
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		boolean male_rd1 = driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();
		
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		
		boolean female_rd1 = driver.findElement(By.xpath("//input[@id='gender-female']")).isSelected();
		System.out.println("Male :"+male_rd1+"\nFemale: "+female_rd1);
		
		
		driver.quit();
		
		

	}

}
