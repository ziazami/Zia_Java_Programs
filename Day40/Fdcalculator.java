package Day40;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Fdcalculator {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		
		ChromeOptions options=new ChromeOptions();
		options.addExtensions(new File("C:\\Users\\ics-guest\\Drivers\\crx files\\uBlock-Origin.crx"));	
				
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		
		String filePath=System.getProperty("user.dir")+"\\testdata\\caldata.xlsx";
		
		int rows=XcelUtils.getRowCount(filePath, "Sheet1");
		for(int i=1; i<=rows; i++)
		{
			
			//1)read row data from xcel
			String pric = XcelUtils.getCellData(filePath, "Sheet1", i, 0);
			String rate = XcelUtils.getCellData(filePath, "Sheet1", i, 1);
			String per1 = XcelUtils.getCellData(filePath, "Sheet1", i, 2);
			String per2 = XcelUtils.getCellData(filePath, "Sheet1", i, 3);
			String freq = XcelUtils.getCellData(filePath, "Sheet1", i, 4);
			String exp_mvalue = XcelUtils.getCellData(filePath, "Sheet1", i, 5);
			//2)Pass above data to application
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			

			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(pric);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rate);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
			Thread.sleep(2000);
			Select perdrop = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			perdrop.selectByVisibleText(per2);
			Thread.sleep(2000);
			Select freqdrop = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			freqdrop.selectByVisibleText(freq);
			Thread.sleep(2000);

//calculate button
WebElement calc= driver.findElement(By.xpath("//div[@class='CTR PT15']//a[1]"));
js.executeScript("arguments[0].click();", calc);


String act_mvalue= driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();

    if(Double.parseDouble(act_mvalue)==Double.parseDouble(exp_mvalue))
    {
    	System.out.println("Test is passed");
    	XcelUtils.setCellData(filePath, "Sheet1", i, 7, "PASSED");
    	XcelUtils.fillGreenColour(filePath, "Sheet1", i, 7);
    }
    else
    {
    	System.out.println("Test is failed");
    	XcelUtils.setCellData(filePath, "Sheet1",i, 7, "Failed");
    	XcelUtils.FillRedColor(filePath, "Sheet1", i, 7);
    }
    Thread.sleep(4000);	
   WebElement clear =  driver.findElement(By.xpath("//img[@class='PL5']"));
    js.executeScript("arguments[0].click();", clear);
    Thread.sleep(3000);
			
		}
		driver.close();	
	}

}
