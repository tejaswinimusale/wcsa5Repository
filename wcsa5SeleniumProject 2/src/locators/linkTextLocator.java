package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class linkTextLocator {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://omayo.blogspot.com/");
			Thread.sleep(2000);
			driver.findElement(By.linkText("Open a popup window")).click();
			
			}

	}

	