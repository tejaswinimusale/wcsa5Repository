package testNgExecution;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
  @Test
  public void Test3Method1() throws InterruptedException {
	  //System.out.println("This is Demo TestNG class!!");
	  
	  Reporter.log("This is Test3 TestNG class!!", true);
	  System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
		
		
}
}
