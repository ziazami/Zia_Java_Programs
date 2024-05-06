package Day21;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;


public class Day21assignment {

		
		public static void main(String[] args) throws InterruptedException
			{
				WebDriver driver =  null;
				System.out.println("Enter the browser you wish to run : (Edge/Chrome)");
				Scanner sc = new Scanner(System.in);
				String browser_name = sc.next();
				
				switch(browser_name) 
				{
				case "chrome": driver = new ChromeDriver();
								break;
				case "edge": 
							driver = new EdgeDriver();
							break;
				default: System.out.println(" Invalid browser name");
				}
				
				driver.get("https://opensource-demo.orangehrmlive.com/");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				//driver.findElement(By.id("login2")).click();
				driver.findElement(By.name("username")).sendKeys("Admin");
				driver.findElement(By.name("password")).sendKeys("admin123");
				Thread.sleep(1000);
				driver.findElement(By.cssSelector("button[type='submit']")).click();
				String act_title= driver.getTitle();
					if (act_title .equals("OrangeHRM"))
					{
						System.out.println("Test case is passed");
					}else 
					{
						System.out.println("The test case is failed");
					}
					Thread.sleep(2000);
					driver.close();
					}

		

	}


