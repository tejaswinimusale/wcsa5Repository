package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	
		public static void main(String[] args) throws InterruptedException {
			 System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("file:///C:/Users/ADMIN/Desktop/WCSA5/Web%20Element/username%20element.html");
			    driver.findElement(By.id("i1")).sendKeys("tejaswinimusale01@gmail.com");
			    Thread.sleep(2000);
			    driver.findElement(By.id("i2")).sendKeys("Aditeju@1");
			    Thread.sleep(2000);
			    
				
						
			}

		}

