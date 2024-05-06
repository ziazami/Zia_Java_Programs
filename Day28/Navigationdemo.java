package Day28;
//ctrl+shift+O

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationdemo {

	public static void main(String[] args) throws MalformedURLException
	{
		WebDriver driver = new ChromeDriver();
		//URL myurl = new URL("https://demo.nopcommerce.com/register");
		//driver.get("https://demo.nopcommerce.com/register");
		
		//driver.navigate().to("https://demo.nopcommerce.com/register");
		//driver.manage().window().maximize();
		
		//driver.navigate().to(myurl);// url format
		//driver.navigate().to("https://demo.nopcommerce.com/register");
		
		//navigational methods
		driver.navigate().to("https://demo.nopcommerce.com/register");
		driver.navigate().to("https://tutorialsninja.com/demo/");
		
		
		driver.navigate().back();  //nop
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh(); 
		
		driver.close();
		driver.quit();

	}

}
