package Day37;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Run_test_on_incognito_mode {

	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito--");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://google.com/");
		

	}

}
