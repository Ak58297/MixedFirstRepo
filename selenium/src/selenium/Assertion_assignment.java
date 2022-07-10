package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Assertion_assignment{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\WORK\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	//	WebDriverWait wait=new WebDriverWait(driver, null);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='checkbox-example'] //input[@id='checkBoxOption2']")));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[@id='checkbox-example'] //input[@id='checkBoxOption2']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='checkbox-example'] //input[@id='checkBoxOption2']")).isSelected());
		driver.findElement(By.xpath("//div[@id='checkbox-example'] //input[@id='checkBoxOption2']")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//div[@id='checkbox-example'] //input[@id='checkBoxOption2']")).isSelected());
        
		//driver.findElement(By.xpath("//div[@id='checkbox-example'] ")).getSize();
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		driver.close();
	}

}