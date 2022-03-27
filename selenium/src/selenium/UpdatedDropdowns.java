package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UpdatedDropdowns{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.getTitle());
		//WebElement staticDropdown= driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		
		//Select dropdown= new Select(staticDropdown);
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		WebElement staticdropdowm=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));
		
		Select dropdowm= new Select(staticdropdowm);
		dropdowm.selectByIndex(6);
		System.out.println(dropdowm.getFirstSelectedOption().getText());
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[text()=' Ranchi (IXR)']")).click();
		System.out.println(driver.findElement(By.xpath("//a[text()=' Ranchi (IXR)']")).getText());
		driver.findElement(By.xpath("(//*[text()=' Ahmedabad (AMD)'])[2]")).click();
		System.out.println(driver.findElement(By.xpath("(//*[text()=' Ahmedabad (AMD)'])[2]")).getText());
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		
		
		//driver.close();
	}

}