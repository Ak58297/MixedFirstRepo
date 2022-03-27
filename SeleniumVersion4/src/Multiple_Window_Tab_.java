import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Window_Tab_ {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\WORK\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> WindowHandles=driver.getWindowHandles();
		Iterator<String> i= WindowHandles.iterator();
		String parent=i.next();
		String child=i.next();
		driver.switchTo().window(child);
		driver.get("https://rahulshettyacademy.com/#/index");
	    String firstCourse=	driver.findElement(By.xpath("(/html/body/app-root/div/app-home/div/section[2]/div[1]/div[2]/div)[1]//div/h2/a")).getText();
		System.out.println(firstCourse);
		
		driver.switchTo().window(parent);
		WebElement Name=driver.findElement(By.xpath("(//*[@name='name'])[1]"));
		Name.sendKeys(firstCourse);
		
		//Screenshot

		File file=Name.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File("logo.png"));
		//driver.quit();
	}

}
