package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://not_for_you/login.do");
		
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys("admin");
		WebElement passTB = driver.findElement(By.name("pwd"));
		passTB.sendKeys("manager");
		
		//Thread.sleep(2000);
		driver.navigate().refresh();
		usnTB.clear();
		

	}

}
