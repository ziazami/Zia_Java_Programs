package Day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamictable_pagination {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		//Login
		WebElement uname = driver.findElement(By.xpath("//input[@id='input-username']"));
		uname.clear();
		uname.sendKeys("demo");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='input-password']"));
		pwd.clear();
		pwd.sendKeys("demo");
		
		WebElement login = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		login.click();
		
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
			
		}
		
		//customers submenu
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		
		//capture text Showing 1 to 10 of 16216 (1622 Pages)
		String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		int total_pages = Integer.parseInt(text.substring(text.indexOf("(")+1 ,text.indexOf("Pages")-1));
		System.out.println(total_pages);
		
		for(int p=1 ;p<=5;p++)
		{
			if(total_pages > 1)
			{
				WebElement act_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				//driver.findElement(By.xpath("//a[normalize-space()='2']")).click();
				System.out.println("Active page is :"+act_page.getText());
				Thread.sleep(3000);
				act_page.click();//javascript
				Thread.sleep(2000);
			}
		}
		
		//read data from the active page
		
		int rows= driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tr")).size();
		for(int r = 1;r<=rows;r++)
		{
			
			String cust_grp = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr[1]//td["+r+"]")).getText();
			System.out.println("Customer Group\n"+cust_grp);
			
		}
		
		
		//driver.quit();
				

	}

}
