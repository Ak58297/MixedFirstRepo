package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class fresco2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\WORK\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://server1it78pqx-ws-dev-server-8000.in-dc-5.projects.hackerrank.net/");
        driver.getPageSource();
        System.out.println(driver.getPageSource());
        driver.switchTo().frame(driver.findElement(By.xpath("/html/body/iframe")));
        Actions a =new Actions(driver);
        WebElement source= driver.findElement(By.id("draggable"));
        WebElement target= driver.findElement(By.id("droppable"));
        a.dragAndDrop(source, target).build().perform();
        System.out.println(driver.findElement(By.id("dropStatus")).getText());

	}

}