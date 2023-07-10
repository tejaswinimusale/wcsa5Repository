package XpathAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotstarXpathfLocatorAssignment {

	
		public static void main(String[] args) throws InterruptedException {
			 System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.hotstar.com/in/paywall#mp-login");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='text']")).sendKeys("tejaswinimusale01@gmail.com");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//span[text()='Get OTP']")).click();			
			

	}

}
