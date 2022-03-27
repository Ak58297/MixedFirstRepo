package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_Cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\WORK\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS); // wait
		driver.manage().window().maximize();// maximize window
		driver.manage().deleteAllCookies();// delAllcookies
	//	driver.manage().deleteCookieNamed("cookies");// Delete any session specific Cookies
		
		driver.get("https://www.google.com");

	}

}
