package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clearMethod {

	
		public static void main(String[] args) throws InterruptedException {
			
			//it is use to send input to text box and active Element
			
			System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("http://127.0.0.1/login.do;jsessionid=3blfou8brpfr5");
			
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			
			driver.findElement(By.id("loginButton")).click();
			

	}

}
