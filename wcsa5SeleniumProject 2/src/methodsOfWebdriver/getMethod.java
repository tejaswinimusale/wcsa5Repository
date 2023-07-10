package methodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethod {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
				WebDriver driver=new ChromeDriver();
				Thread.sleep(2000);
				driver.get("https://www.google.com");
		}

	}

