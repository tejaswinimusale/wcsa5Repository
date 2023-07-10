package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPageAssignment {

	
		public static void main(String[] args) throws InterruptedException {
			 System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
					WebDriver driver=new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://www.facebook.com//in/login");
					
					driver.findElement(By.id("email")).sendKeys("tejaswinimusale01@gmail.com");
					
					driver.findElement(By.id("pass")).sendKeys("Aditeju@1");
					Thread.sleep(4000);
					driver.findElement(By.id("//button[@class='fbx UIPage_LoggedOut _-kb _605a b_c3pyn-ahh chrome webkit win x1 Locale_en_GB cores-lt4 _19_u']")).click();
					
							
				}

			}


	
