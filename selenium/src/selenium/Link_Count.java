package selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Link_Count {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\WORK\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement scope1 = driver.findElement(By.id("gf-BIG"));
		System.out.println(scope1.findElements(By.tagName("a")).size());

		WebElement scope2 = driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		System.out.println(scope2.findElements(By.tagName("a")).size());

		for (int i = 0; i < scope2.findElements(By.tagName("a")).size(); i++) {

			String ClickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);

			scope2.findElements(By.tagName("a")).get(i).sendKeys(ClickOnLink);

			/*
			 * WebDriverWait w= new WebDriverWait(driver,2);
			 * w.until(ExpectedConditions.elementToBeClickable(scope2.findElements(By.
			 * tagName("a")).get(i))); //scope2.findElements(By.tagName("a")).get(i);
			 */

		}

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		String ParentWindow=it.next();
		
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			Thread.sleep(5);
		}
		driver.switchTo().window(ParentWindow);

		//driver.quit();

	}

}