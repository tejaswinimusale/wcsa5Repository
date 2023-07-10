package XpathAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeXpathLocatorAssignment {

	
		public static void main(String[] args) throws InterruptedException {
			 System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://127.0.0.1/login.do;jsessionid=48awa5vdfge24");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("tejaswinimusale01@gmail.com");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//a[text()='Login']")).click();			
		}

}
