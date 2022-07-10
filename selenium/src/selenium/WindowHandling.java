package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




//import com.sun.tools.classfile.Opcode.Set;

public class WindowHandling {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABHISHEK KUMAR\\Downloads\\chromedriver_99\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[text()='Google Play Store'] ")).click();
		
		Set<String> WindowHandles= driver.getWindowHandles();
		Iterator<String> It= WindowHandles.iterator();
		
		String ParentWindow=It.next();
		String ChildWindow=It.next();
		
		driver.switchTo().window(ChildWindow);
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//*[text()='Wikipedia']")).getText().split("p")[0].trim());
		
		
		driver.switchTo().window(ParentWindow);
		System.out.println(driver.getTitle());
		
		driver.close();
		
		
		
		
	   
		
	    
        
	  
	}

}