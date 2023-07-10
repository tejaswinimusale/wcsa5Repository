package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	    String button = driver.findElement(By.xpath("//button[text()='Login']")).getText();
	    System.out.println(button);
	    WebElement link = driver.findElement(By.xpath("//p[conatains@class,'oxd-text oxd-text--p orangehrm-1)]"));
	    System.out.println(link);
	    
	}

}
