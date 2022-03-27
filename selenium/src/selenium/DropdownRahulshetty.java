package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropdownRahulshetty{

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\WORK\\chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		
		
		dr.get("https://www.spicejet.com/");
		Thread.sleep(2000L);
		System.out.println(dr.getTitle());
		WebElement staticDropdown= dr.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(2);
		dropdown.selectByVisibleText("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dr.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		WebElement staticDropdown1= dr.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']"));
		Select dropdown1=new Select(staticDropdown1);
		dropdown1.selectByIndex(2);
		
		
		
		
		
	    
				/*dr.findElement(By.linkText("Practice")).click();
		dr.findElement(By.linkText("Automation Practise - 2")).click();*/
		
		
		
		//dr.close();
		
		
		

	}

}