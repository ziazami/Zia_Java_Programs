package Day37;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisabledAutomated_messages_chrome_browser {

	public static void main(String[] args)
	{
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excluedSwitches",new String[] {"enable-automation"});
		WebDriver driver =new ChromeDriver(options);
		
		driver.get("https://google.com/");
		

	}

}
