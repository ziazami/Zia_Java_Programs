package Day41;

import org.testng.annotations.Test;

//login-openapp-logout
public class Firsttestcase 
{
    @Test(priority=1)
	public void login()
	{
		System.out.println("login done");
		}
	@Test(priority=2)
	public void openapp()
	{
		System.out.println("app open  done");
	}
	@Test(priority=3)
	public void logout()
	{
		System.out.println("logout done");
	}
}
