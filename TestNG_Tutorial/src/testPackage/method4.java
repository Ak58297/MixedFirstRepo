package testPackage;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class method4 {

	@Test
	public void month1()
	{
		System.out.println("January");
	}
	
	@Test(groups= {"Smoke"})
	public void month2()
	{
		System.out.println("February");
	}
	
	@BeforeTest
	public void month3()
	{
		System.out.println("I will execute before all the months");
	}
	
	@BeforeSuite
	public void month4()
	{
		System.out.println("I will execute before everything");
	}
}
