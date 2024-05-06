package Day37;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Blocking_ads {

	public static void main(String[] args) 
	
	{
		ChromeOptions options=new ChromeOptions();
		options.addExtensions(new File("C:\\Users\\ics-guest\\Drivers\\crx files\\uBlock-Origin.crx"));	
				
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://text-compare.com/");
		

	}

}
