package testPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class method1 
{

	@AfterTest
	public void daylast() 
	{
		
		System.out.println("I will execute all the last of all the days");

	}
	@BeforeMethod
	public void everymethod() 
	{
		
		System.out.println("I will execute before every method in class( method 1)");

	}
	
	@Test
	public void day1() 
	{
		
		System.out.println("Monday");

	}
	
	@Test
	public void day2()
	{
		System.out.println("Tuesday");
		
		
	}
	@Test(groups= {"Smoke"})
	public void day3()
	{
		System.out.println("Wednesday");
	}
	
	

}


