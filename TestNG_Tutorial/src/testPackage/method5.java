package testPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class method5 {
	@Parameters({"URL"})
	@Test
	public void para(String u) 
	{
		System.out.println("test parameters");
		System.out.println(u);

	}

}
