package chapinschool.tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserAbleToClickOnTheAboutLink {

	public static void main(String[] args) throws InterruptedException {
		//pre-requirment 
		//Chrome browser
		
		
		String baseDir = System.getProperty("user.dir");
		String chromeDir = baseDir + "/BrowserDriver/chromedriver";
		
		
		System.setProperty("webdriver.chrome.driver", chromeDir);
		
		WebDriver driver = new ChromeDriver();
		
		
		//Step1: Navigate to the URL
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		
		
		
		//Step2: Click on the About Link
		WebElement about = driver.findElement(By.xpath("//*[@id=\"hptl\"]/a[1]"));
		about.click();
		Thread.sleep(5000);
		
		
		driver.quit();
		
		
		
		

	}

}
