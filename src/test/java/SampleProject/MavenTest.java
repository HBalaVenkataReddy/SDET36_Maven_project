package SampleProject;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MavenTest
{
	@Test
	public void maven4Test()
	{
		System.out.println("Test Case 4");
	}
	@Test
	public void maven5Test()
	{
		Reporter.log("Test Case 5", true);
	}
	@Test
	public void maven6Test() 
	{
		System.out.println("Test Case 6");
		Reporter.log("Test Case 7", true);
		System.out.println("Test Case 8");
	}
}
