package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		
		Point newsElement = driver.findElement(By.xpath("//h2[.='News']")).getLocation();
		int xaxis = newsElement.getX();
		int yaxis = newsElement.getY();
		
	
		System.out.println("x axis of news webElement :" + xaxis +  "y axis of news webElement :" + yaxis);
		

	}

}
