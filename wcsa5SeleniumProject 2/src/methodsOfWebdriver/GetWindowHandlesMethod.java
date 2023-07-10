package methodsOfWebdriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
		    //launch the browser
			WebDriver driver=new ChromeDriver();
			//Maximize the window
			driver.manage().window().maximize();
			//apply implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://omayo.blogspot.com/");
			String parentHandle = driver.getWindowHandle();
			System.out.println("Address of parent window :" +parentHandle);
			
			
			//launch the child window
			driver.findElement(By.partialLinkText("Open a popup window")).click();
			Thread.sleep(2000);
			//get the handle or address of child window only
		    Set<String> allHandles = driver.getWindowHandles(); 
		    //Read addresses by using looping statement
		    for(String wh:allHandles)
		    {
		    	System.out.println(wh);
		
		    }
	   }
 }
		    
			


