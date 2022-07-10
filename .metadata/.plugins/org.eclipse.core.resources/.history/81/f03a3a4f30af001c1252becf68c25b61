package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assigment2{

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\WORK\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cleartrip.com");
		System.out.println(driver.getTitle()); 
		
		WebElement Adults=driver.findElement(By.xpath("//h4[text()='Adults']/../select"));
		Select dropdown1=new Select(Adults);
		dropdown1.selectByIndex(6);
		
		WebElement Children=driver.findElement(By.xpath("//h4[text()='Children']/../select"));
		Select dropdown2=new Select(Children);
		dropdown2.selectByIndex(2);
		
		WebElement Infants=driver.findElement(By.xpath("//h4[text()='Infants']/../select"));
		Select dropdown3=new Select(Infants);
		dropdown3.selectByIndex(1);
		
		driver.findElement(By.xpath("//*[@class='flex flex-middle p-relative homeCalender']/button"));
	//	System.out.println("(//div[@class='Day-grid flex flex-middle flex-column flex-top'])[8]");
		//driver.findElement(By.xpath("(//div[@class='Day-grid flex flex-middle flex-column flex-top'])[8]")).click();
	    System.out.println(driver.findElement(By.partialLinkText("Class of travel, Airline preference")).getText());
	    driver.findElement(By.xpath("//*[text()='More options:']")).click();
		driver.findElement(By.xpath("//*[@placeholder='Airline name']")).sendKeys("Airline entered");
	//	driver.findElement(By.xpath("//button[text()='Search flights']")).click();
		
		
	}

}