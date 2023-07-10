package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkdinLoginPageAssignment {

		public static void main(String[] args) throws InterruptedException {
			 System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://in.linkedin.com/");
				//To identify 
				driver.findElement(By.id("session_key")).sendKeys("tejaswinimusale01@gmail.com");
				//Thread.sleep(2000);
				driver.findElement(By.id("session_password")).sendKeys("Aditeju@1");
				Thread.sleep(4000);
				driver.findElement(By.id("<button class='btn login-button btn-submit btn-smallbtn-md btn-primary flex-shrink-0 cursor-pointer\r\n"
						+ "            sign-in-form__submit-btn--full-width']")).click();
				
	}

}
