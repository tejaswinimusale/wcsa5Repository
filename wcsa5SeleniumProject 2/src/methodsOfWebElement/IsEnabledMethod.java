package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("username")).sendKeys("tejaswini");
		driver.findElement(By.name("pwd")).sendKeys("123");
		boolean loginButton=driver.findElement(By.xpath("//button[contains[@class,'_acap']")).isEnabled();
		System.out.println(loginButton);
	
   }
}
