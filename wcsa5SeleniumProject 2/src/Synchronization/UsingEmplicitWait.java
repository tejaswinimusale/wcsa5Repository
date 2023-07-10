package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingEmplicitWait {

	
		public static void main(String[] args) throws InterruptedException {
			 System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				driver.get("https://www.instagram.com/"); //launch browser
			
	            driver.findElement(By.xpath("//input[@type='username']]")).sendKeys("tejaswinimusale01@gmail.com");
	            
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Aditeju@1");
				
		        driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
			
				}

		}
	
	