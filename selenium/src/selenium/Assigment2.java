package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assigment2{

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\WORK\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.cleartrip.com");
		System.out.println(driver.getTitle()); 
		
		WebElement Adults=driver.findElement(By.xpath("//h4[text()='Adults']/..//select"));
		Select dropdown1=new Select(Adults);
		dropdown1.selectByIndex(6);
		
		WebElement Children=driver.findElement(By.xpath("//h4[text()='Children']/..//select"));
		Select dropdown2=new Select(Children);
		dropdown2.selectByIndex(2);
		
		WebElement Infants=driver.findElement(By.xpath("//h4[text()='Infants']/..//select"));
		Select dropdown3=new Select(Infants);
		dropdown3.selectByIndex(1);
		
		
		
		driver.findElement(By.xpath("(//*[@placeholder='Any worldwide city or airport'])[1]")).click();
		List<WebElement> airportNames=driver.findElements(By.xpath("(//*[@placeholder='Any worldwide city or airport'])[1]/../following-sibling::div/ul/li"));
		System.out.println(airportNames.size());
		for(int i=0;i<airportNames.size();i++)
		{
			String AirName=airportNames.get(i).getText();
			
			if(AirName.contains("Kolkata"))
			{
				driver.findElements(By.xpath("(//*[@placeholder='Any worldwide city or airport'])[1]/../following-sibling::div/ul/li")).get(i).click();
			}
		}
		
		Thread.sleep(2);
		
		
		driver.findElement(By.xpath("(//*[@placeholder='Any worldwide city or airport'])[2]")).click();
		List<WebElement> airportName2=driver.findElements(By.xpath("(//*[@placeholder='Any worldwide city or airport'])[2]/../following-sibling::div/ul/li"));
		System.out.println(airportName2.size());
		for(int i=0;i<airportName2.size();i++)
		{
			String AirName2=airportName2.get(i).getText();
			
			if(AirName2.contains("Mumbai"))
			{
				driver.findElements(By.xpath("(//*[@placeholder='Any worldwide city or airport'])[2]/../following-sibling::div/ul/li")).get(i).click();
			}
		}
		//driver.findElement(By.xpath("//*[@class='flex flex-middle p-relative homeCalender']/button"));
	//	System.out.println("(//div[@class='Day-grid flex flex-middle flex-column flex-top'])[8]");
		//driver.findElement(By.xpath("(//div[@class='Day-grid flex flex-middle flex-column flex-top'])[8]")).click();
	    System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Class of travel, Airline preference')]")).getText());
	    driver.findElement(By.xpath("//*[contains(text(),'Class of travel, Airline preference')]")).click();
		driver.findElement(By.xpath("//*[@placeholder='Airline name']")).sendKeys("Indigo (6E)");
	driver.findElement(By.xpath("//button[text()='Search flights']")).click();
		
		
	}

}