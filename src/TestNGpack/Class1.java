package TestNGpack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class1 {
	
	@BeforeMethod
	public void m1()
	{
		System.out.println("before method");
	}
	
	@Test
	public void tc2()
	{
		System.out.println("Test case2");		
	}
		
	@Test
	public void tc1()
	{
		System.out.println("Test case1");		
	}
	
	@AfterMethod
	public void m2()
	{
		System.out.println("After method");
	}

}
