package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classNameLocator {

	public static void main(String[] args) {
		 System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			driver.switchTo().activeElement().sendKeys("ross geller",Keys.ENTER);
			driver.findElement(By.className("srp")).click();
			
			}

	}

	
