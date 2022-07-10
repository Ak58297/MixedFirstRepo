package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;



public class Dropdown_text {

	public static void main(String[] args) {

// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\WORK\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");

		WebElement textarea = driver.findElement(By.id("autocomplete"));

//Type in capital
		Actions a = new Actions(driver);

		a.moveToElement(textarea).click().keyDown(Keys.SHIFT).sendKeys("ind").keyUp(Keys.SHIFT).build().perform();
		
		
		driver.findElement(By.id("name")).sendKeys("name");

		// .sendKeys("ind");

		//driver.findElement(By.id("autocomplete")).sendKeys(Keys.LEFT_SHIFT);

		//driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		driver.close();

	}

}