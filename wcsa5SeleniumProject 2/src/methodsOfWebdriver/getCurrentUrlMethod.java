package methodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUrlMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
		}


}


