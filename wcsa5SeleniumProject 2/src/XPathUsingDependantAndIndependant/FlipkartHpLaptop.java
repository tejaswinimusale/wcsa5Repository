package XPathUsingDependantAndIndependant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartHpLaptop {


		public static void main(String[] args) throws InterruptedException {
			 System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com/");
			
				driver.findElement(By.xpath("//button[text()='✕']")).click();
			   
				driver.findElement(By.xpath("//input[@name='q']")).sendKeys("HP laptop");
				driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			    Thread.sleep(2000);
				driver.findElement(By.xpath("//div[text()='Core i5']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[text()='Brand']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[text()='HP']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[text()='Operating System']")).click();
				Thread.sleep(2000);
			    driver.findElement(By.xpath("//div[text()='Windows 10']")).click();
			    Thread.sleep(2000);
		}

}
