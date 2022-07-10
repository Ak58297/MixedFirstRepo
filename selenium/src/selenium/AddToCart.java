package selenium;

import java.util.Arrays;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	//public static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\WORK\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String itemsNeeded[] = { "Cucumber", "Brocolli", "Beetroot", "Tomato" };
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		addItems(driver,itemsNeeded);

	}

	public static void addItems(WebDriver driver,String itemsNeeded[]) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='product']/h4"));
		for (int i = 0; i < products.size(); i++) {

//Brocolli - 1 Kg

			String[] OnlyProductName = products.get(i).getText().split("-");// Brocolli , 1 Kg
			String TrimmedProductName = OnlyProductName[0].trim();

//format it to get actual vegetable name
//convert array into array list for easy search
//  check whether name you extracted is present in arrayList or not-
			List<String> itemsNeededList = Arrays.asList(itemsNeeded);// covert Array into array list

			if (itemsNeededList.contains(TrimmedProductName)) {
				j++;

//click on Add to cart

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsNeeded.length)
				{
					break;// so when j==4 then this loop will end.

				}

			}

		}

	}

}