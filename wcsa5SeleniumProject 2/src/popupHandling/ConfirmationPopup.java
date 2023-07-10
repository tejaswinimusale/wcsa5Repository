package popupHandling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

	
		public static void main(String[] args) throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		    
		    driver.get("file:///C:/Users/ADMIN/Desktop/WCSA5/Web%20Element/ConfirmationPopup.html");
		    driver.findElement(By.xpath("//input[@type='submit']")).click();
	     	Thread.sleep(2000);
	     	
	     	//handle confirmation pop up
	     	Alert al = driver.switchTo().alert();
	     	al.accept();
	        // al.dismiss();
	     	// System.out.println(al.getText());

	}
}


