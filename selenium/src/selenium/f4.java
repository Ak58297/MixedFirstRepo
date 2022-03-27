/*package selenium;

import org.testng.annotations.Test;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class f4 {
	@Test(groups = { "include-test-one" })
	public void dragAndDrop() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
		//options.addArguments("--no-sandbox");
		//options.addArguments("--disable-dev-shm-usage");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://server9mfnepwf-ws-dev-server-8000.in-dc-5.projects.hackerrank.net/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		String dragAble = "//div[@id='draggable']";
		String dropAble = "//div[@id='droppable']";
		WebElement From = driver.findElement(By.xpath(dragAble));
		WebElement To = driver.findElement(By.xpath(dropAble));
		WebElement DropStatus = driver.findElement(By.xpath("//p[@id='dropStatus']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(From, To).build().perform();
		System.out.println(DropStatus.getText());
		driver.close();
	}

	@Test(groups = { "include-test-two" })
	public void WikiHow() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		WebDriver driver = new ChromeDriver();
		driver.get("https:/wikipedia.org");
		WebElement PlayStore = driver.findElement(By.xpath("//li[@class = 'app-badge app-badge-android']/a"));
		PlayStore.click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getTitle());
		driver.close();
	}
}*/