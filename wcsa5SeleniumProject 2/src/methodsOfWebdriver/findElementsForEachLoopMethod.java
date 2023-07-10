package methodsOfWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsForEachLoopMethod {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				driver.switchTo().activeElement().sendKeys("bikes");
				Thread.sleep(2000);
				List<WebElement> bikes = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
				
		     	for(WebElement we : bikes) {
				String bikesOptions = we.getText();
				System.out.println(bikesOptions);
			}
	    }

	}

