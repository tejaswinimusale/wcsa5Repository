package cssSelectorAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoCssSelectorAssignment {

	
		public static void main(String[] args) throws InterruptedException {
			 System.setProperty("webdriver.chrome.driver", "./drivers.ChromeDriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.zomato.com/");
				driver.findElement(By.cssSelector("signup")).click();
;				Thread.sleep(4000);
				driver.findElement(By.cssSelector("input[class='sc-1yzxt5f-9 dFkpnp']")).sendKeys("tejaswinimusale01@gmail.com");
				driver.findElement(By.cssSelector("input[class='sc-1yzxt5f-9 bbrwhB']")).sendKeys("Aditeju@1");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small']")).click();
				
						
			}

		}

						
	