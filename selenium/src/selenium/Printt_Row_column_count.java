package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printt_Row_column_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\WORK\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		System.out.println("Column "+driver.findElements(By.xpath("(//*[@id='product'])[1]//tr")).size());
		System.out.println("Column "+driver.findElements(By.xpath("(//*[@id='product'])[1]//tr[1]//th")).size());
		
		List<WebElement> column_size = driver.findElements(By.xpath("(//*[@id='product'])[1]//tr[3]//td"));
		for(int i=0;i<column_size.size();i++)
		{
			column_size.get(i).getText();
			System.out.println(column_size.get(i).getText());
		}
		
		

		driver.close();
	}

}