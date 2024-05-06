package Day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadow_dom {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().maximize();
		
		//This Element is inside single shadow DOM.
		

	}

}
