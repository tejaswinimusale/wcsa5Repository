package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginPageAssignment {

	
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1/login.do;jsessionid=c25vfbbfsubt");
		    driver.findElement(By.className("username")).sendKeys("admin");
		    Thread.sleep(2000);
		    driver.findElement(By.className("pwd")).sendKeys("manager");
		    Thread.sleep(2000);
		    driver.findElement(By.id("loginButton")).click();
			
					
		}

	}
