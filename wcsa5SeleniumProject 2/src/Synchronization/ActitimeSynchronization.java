package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeSynchronization {

	
		public static void main(String[] args) throws InterruptedException {
			 System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("http://127.0.0.1/login.do;jsessionid=7ogeqetmd2uf1"); 
				String actualTitleOfLoginPage = driver.getTitle();
				if(actualTitleOfLoginPage.equals("actiTime.Login"))
				{
					System.out.println("Title is matched Test Case Passed");
					driver.findElement(By.name("username")).sendKeys("admin");
					driver.findElement(By.name("pwd")).sendKeys("manager");
					
					
					
						
				}
			
		}

}
