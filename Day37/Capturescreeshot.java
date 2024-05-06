package Day37;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Capturescreeshot
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		
		//Full page screen shot
		TakesScreenshot ts =(TakesScreenshot)driver;
		File sourcefile =ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		sourcefile.renameTo(targetfile);
		
		    //2)-capture screenshot of specific page of screen
			/*
			 WebElement featured_pdts = driver.findElement(By.xpath("//div[@class='page-body']"));
			File sourcefile1 = featured_pdts.getScreenshotAs(OutputType.FILE);
			File targetfile1=new File(System.getProperty("user.dir")+"\\screenshots\\portionpage.png");
			
			sourcefile1.renameTo(targetfile1);
			*/
			
		//3)-capture particular webelement	
			/*WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
			File sourcefile2 = logo.getScreenshotAs(OutputType.FILE);
			File targetfile2 = new File(System.getProperty("user.dir")+"\\screenshots\\webelement.png");
			sourcefile2.renameTo(targetfile2);*/
			
			
		
		driver.quit();

	}

}
