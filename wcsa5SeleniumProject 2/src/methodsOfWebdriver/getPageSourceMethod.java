package methodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPageSourceMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.instagram.com");
			String pageSource = driver.getPageSource();
			System.out.println(pageSource);

}


}


