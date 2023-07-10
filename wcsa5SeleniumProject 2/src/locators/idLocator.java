package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class idLocator {

	public static void main(String[] args) {
		 System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://wwww.facebook.com/");
				WebElement usn =driver.findElement(By.name("email"));
				usn.sendKeys("qspiders");
				}

		}



	