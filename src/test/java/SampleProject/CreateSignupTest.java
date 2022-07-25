package SampleProject;

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
		System.out.println("Test2 --> PraticeTest2");
	}
	@Test
	public void test3()
	{
		System.out.println("test3 --> PraticeTest3");
	}
}