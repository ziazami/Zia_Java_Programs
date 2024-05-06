package Day40;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_cd_calculator {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		//ChromeOptions options=new ChromeOptions();
		//options.addExtensions(new File("C:\\Users\\ics-guest\\Drivers\\crx files\\uBlock-Origin.crx"));	
				
		//WebDriver driver=new ChromeDriver(options);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		driver.manage().window().maximize();
		
		String filePath1=System.getProperty("user.dir")+"\\testdata\\caldata2.xlsx";
		
		int rows=XcelUtils.getRowCount(filePath1,"Sheet1");
		System.out.println("Total rows: "+rows);
		
		WebElement dep_amount = driver.findElement(By.xpath("//input[@id='mat-input-0']"));
		WebElement length = driver.findElement(By.xpath("//input[@id='mat-input-1']"));
		WebElement int_rate = driver.findElement(By.xpath("//input[@id='mat-input-2']"));
		WebElement cmpd = driver.findElement(By.xpath("//div[@class='mat-select-arrow ng-tns-c109-4']"));
		WebElement btn = driver.findElement(By.xpath("//button[@id='CIT-chart-submit']"));
		
		for(int i=1;i<=rows;i++)
		{
			//reading data from xcel file
			String amount= XcelUtils.getCellData(filePath1, "Sheet1", i, 0);
			String months= XcelUtils.getCellData(filePath1, "Sheet1", i, 1);
			String rate = XcelUtils.getCellData(filePath1, "Sheet1", i, 2);
			String comp_monthly=XcelUtils.getCellData(filePath1, "Sheet1", i, 3);
			String exp_value=XcelUtils.getCellData(filePath1, "Sheet1", i, 4);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			dep_amount.clear();
			length.clear();
			int_rate.clear();
			Thread.sleep(2000);
			dep_amount.sendKeys(amount);
			Thread.sleep(2000);
			length.sendKeys(months);
			Thread.sleep(2000);
			int_rate.sendKeys(rate);
			Thread.sleep(2000);
			//cmpd.click();
			js.executeScript("arguments[0].click();", cmpd);
			Thread.sleep(2000);
			
			
			List<WebElement> opt=driver.findElements(By.xpath("//div[@class='cdk-overlay-pane']"));
			for(WebElement op: opt)
			{
				if(op.getText() .equals(comp_monthly))
				js.executeScript("arguments[0].click();", op);
				
			 }
			Thread.sleep(2000);
			
			//JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", btn);
			
		String act_value=driver.findElement(By.xpath("//span[@id='displayTotalValue']")).getText();
		System.out.println("Actual value" +act_value);
		System.out.println("Expected value" +exp_value);
		if(act_value .equals (exp_value))
		{
			System.out.println("Test is passed");
			XcelUtils.setCellData(filePath1, "Sheet1", i, 6, "PASSED");
			XcelUtils.fillGreenColour(filePath1, "Sheet1", i, 6);
		}else
		{
			System.out.println("Test is failed");
			XcelUtils.setCellData(filePath1, "Sheet1", i, 6, "FAILED");
			XcelUtils.FillRedColor(filePath1, "Sheet1", i, 6);
		}
		}
		driver.close();
		
	}

}
