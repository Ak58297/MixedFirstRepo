package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WORK\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
	driver.get("https://www.amazon.com/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	Actions a =new Actions(driver);
	
	//moves to speific element
	a.moveToElement(driver.findElement(By.xpath("(//*[@id='nav-tools']/a)[2]"))).build().perform();
	
	
	//Enter Uppercase Characters
	a.moveToElement(driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("all printed in upper characters").build().perform();
	
	//Double click on the characters entered
	a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).doubleClick();
	
	
	//driver.close();
	
	
	
	
	

	}

}