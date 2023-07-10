package methodsOfWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementMethods {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://127.0.0.1/login.do;jsessionid=4q5ao58kfq3qv");
				WebElement usn=driver.findElement(By.xpath("//input[@class='textField']"));
				usn.sendKeys("Manager");
			}


	}
