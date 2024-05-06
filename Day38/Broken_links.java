package Day38;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links {

	public static void main(String[] args) 
	{
		/*
		  href="url"    ---> hit url to server ------> status code >=400 ---broken link
		 */
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		
		driver.get("http://www.deadlinkcity.com");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links in the webpage :"+links.size());
		
		int broken_links=0;
		
		for(WebElement element: links)
		{
			String href_value = element.getAttribute("href");
			if (href_value == null || href_value .isEmpty())
			{
				System.out.println("There is no href value for this tag so cannot check");
				continue;
			}
			try
			{
				URL link_url = new URL(href_value);
				//establish connection
				HttpURLConnection hconn = (HttpURLConnection)link_url.openConnection();
				hconn.connect(); // connecting to server
				
				if(hconn.getResponseCode()>= 400)
				{
					System.out.println(href_value+"----------> Is Broken Link");
					broken_links++;
				}
				else
				{
					System.out.println(href_value+"-------> is valid Link");
				}
			}catch(Exception e)
			{
				//exception handles
			}
			
		}
         System.out.println("Number of broken links"+broken_links);
	}

}
