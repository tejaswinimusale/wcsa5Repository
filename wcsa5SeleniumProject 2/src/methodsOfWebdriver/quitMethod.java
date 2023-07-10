package methodsOfWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quitMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://omayo.blogspot.com/");
			driver.findElement(By.linkText("open the popup window")).click();
			driver.quit();
		
			
			
}


}


