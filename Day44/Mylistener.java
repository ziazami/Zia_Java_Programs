package Day45;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Mylistener implements ITestListener
{
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test is passed:");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test is failed:");
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test is skipped:");
	}
	
	public void onStart(ITestContext  context)
	{
		System.out.println("Test is Started:");
	}
	public void onFinish(ITestContext context)
	{
		System.out.println("Test is Finished:");
	}
}
