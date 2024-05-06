package Day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ingectionprocess {

	public static void main(String[] args) 
	{
		
		//Handle authenticated popups
		
		WebDriver driver = new ChromeDriver();
	    driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	    driver.manage().window().maximize();
	    
	    
	  //Syntax: https://username:password@url  

	}

}
