package SampleProject;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateSignupTest
{
	@Test
	public void test1()
	{
		String url=System.getProperty("Url");
		String browser=System.getProperty("Browser");
		String userName=System.getProperty("UserName");
		String password=System.getProperty("Password");
		
		System.out.println("Test2 --> PraticeTest1");
		System.out.println("Browser:"+browser);
		System.out.println("URL:"+url);
		System.out.println("UserName:"+userName);
		System.out.println("Password:"+password);
	}
	@Test
	public void test2()
	{
		Reporter.log("Test2 --> PraticeTest2", true);
	}
	@Test
	public void test3()
	{
		Reporter.log("test3 --> PraticeTest3", true);
	}
}