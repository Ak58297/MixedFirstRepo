package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait; 

class Assignment_for_Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\WORK\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.switchTo().alert().accept();
		System.out.println(driver.findElements(By.tagName("fieldset")).size());
		WebElement checkbox=driver.findElement(By.xpath("(//fieldset)[4]"));
		System.out.println(checkbox.findElements(By.tagName("label")).size());
        driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
        String name=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
        
        WebElement Dropdown= driver.findElement(By.id("dropdown-class-example"));
        Select s= new Select(Dropdown);
        s.selectByVisibleText(name);
        
        driver.findElement(By.id("name")).sendKeys(name);
        driver.findElement(By.id("alertbtn")).click();
        String Alert=driver.switchTo().alert().getText();
       
        if(Alert.contains(name))
        {
        	driver.switchTo().alert().accept();
        	System.out.println("Passed");
        }
        else
        {
        	System.out.println("Fail");
        }
        
        
        
        
         
       
		
		

		driver.close();
		

	}

}