package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\WORK\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();  
	/* driver.get("http://www.google.com");// enter url
		System.out.print(driver.getTitle()); // print the title
		System.out.println(driver.getCurrentUrl()); // to see output of exact url, to avoid hacking */
		
		
		//FACEBOOK Login
		driver.get("https://en-gb.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		driver.findElement(By.id("email")).sendKeys("Abhiace.058@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.xpath("//*[text()='Not You?']")).click();
		
		//System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Find your account and log in.')]/..")).getText());
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//driver.navigate().back();
		driver.close(); // closes the current browser
		//driver.quit(); // Closes all the browsers opened by selenium scripts(mainly for child window)
		

	}

}