package Assignment;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoLoginPageAssignment {

	
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./drivers.ChromeDriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.zomato.com/");
			driver.findElement(By.linkText("Sign up")).click();
			driver.findElement(By.className("sc-1yzxt5f-9 jucaYn")).sendKeys("tejaswinimusale012gmail.com");
		    driver.findElement(By.className("sc-1yzxt5f-9 jucaYn")).sendKeys("Aditeju@1");
			
					
		}

	}
