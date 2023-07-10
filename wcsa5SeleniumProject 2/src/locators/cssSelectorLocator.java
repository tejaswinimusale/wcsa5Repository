package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class cssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://wwww.facebook.com/");
			driver.findElement(By.cssSelector("input[id^='e'")).sendKeys("tejaswinimusale01@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[class$='_9npi'")).sendKeys("Aditeju@1");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("button[name='login'")).click();			
			
			
			
			
			}

	}
	