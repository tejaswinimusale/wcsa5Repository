package methodsOfWebdriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
			    //launch the browser
				WebDriver driver=new ChromeDriver();
				//Maximize the window
				driver.manage().window().maximize();
				//apply implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//launch web application
				driver.get("http://omayo.blogspot.com/");
				String parentHandle = driver.getWindowHandle();
				System.out.println(parentHandle);
				
	}

}
