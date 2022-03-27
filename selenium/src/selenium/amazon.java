package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WORK\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("lava phone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.id("low-price")).sendKeys("0");
		driver.findElement(By.id("high-price")).sendKeys("4999");
		driver.findElement(By.xpath("//[@id='a-autoid-1-announce']/parent::/input")).click();
		//number of items in a page
		System.out.println(driver.findElements(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']")).size());
		
		int c=driver.findElements(By.xpath("//*[@class='a-normal']")).size();
		System.out.println(driver.findElements(By.xpath("//*[@class='a-normal']")).size()+1);
		
		//WebElement check=driver.findElement(By.xpath("//*[@class='a-last']"));
		int sum=0;
		for(int k=0;k<(c+1);k++)
		{
			
			for(int i=0;i<=driver.findElements(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']")).size();i++)
			{
			 sum=sum+i;
			}
			driver.findElement(By.xpath("//*[text()='Next']")).click();
			k++;
		}
		System.out.println(sum);
		
		
		
		
		
	}

}