package Day36;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabandwindow {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/");
		
		//selenium 4
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.orangehrm.com/");
		
		//driver.switchTo().newWindow(WindowType.WINDOW);
		//driver.get("https://www.orangehrm.com/");  //replace on same window
	}

}
