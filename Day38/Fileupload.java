package Day38;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		//single file upload
		//driver.findElement(By.id("filesToUpload")).sendKeys("C:\\Users\\ics-guest\\OneDrive\\Desktop\\MAMTHA\\API testing\\Java_coding_Q_A.pdf");
		
		//multiple file upload
		
		String file1 = "C:\\Users\\ics-guest\\OneDrive\\Desktop\\MAMTHA\\API testing\\Java_coding_Q_A.pdf";
		String file2 = "C:\\Users\\ics-guest\\OneDrive\\Desktop\\MAMTHA\\dorothy-material.pdf";
				
		driver.findElement(By.id("filesToUpload")).sendKeys(file1+"\n"+file2);
		
		//verification
		int no_of_files = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		System.out.println("Number of files uploaded are: "+no_of_files);
		
				
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Java_coding_Q_A.pdf") && 
				driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("dorothy-material.pdf"))
						{
						System.out.println("Files are uploaded");
						
	                       }
		else
		{
			System.out.println("Files not uploaded");
		}

}
}
