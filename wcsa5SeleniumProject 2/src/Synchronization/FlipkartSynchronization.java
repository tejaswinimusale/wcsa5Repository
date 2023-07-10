package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSynchronization {

	

		public static void main(String[] args) throws InterruptedException {
			 System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com/"); //launch browser
			
	            driver.findElement(By.xpath("//button[text()='✕']")).click(); //handle pop up
	            
				driver.findElement(By.xpath("//span[text()='Cart']")).click(); //click on cart
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//span[text()='Login']")).click(); //click on login button
				
			}

		}
		
