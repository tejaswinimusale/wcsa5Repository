package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLoginPageAssignment {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.netflix.com/in/login");
			//To identify 
			driver.findElement(By.id("id_userLoginId")).sendKeys("tejaswinimusale01@gmail.com");
			//Thread.sleep(2000);
			driver.findElement(By.id("id_password")).sendKeys("Aditeju@1");
			Thread.sleep(4000);
			driver.findElement(By.id("//button[@class='btn login-button btn-submit btn-small']")).click();
			
					
		}

	}

