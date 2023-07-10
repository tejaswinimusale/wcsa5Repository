package takesScreenShort;


import java.io.File;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShortWay3 {
	
	//By creating the obj of browser specific classes

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.firefox.driver", "./drivers.FireFoxDriver.exe");
		
		ChromeDriver cdriver = new ChromeDriver();
		cdriver.manage().window().maximize();
		cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cdriver.get("https://www.selenium.dev");
		TakesScreenshot ts =(TakesScreenshot) cdriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshort/ssway3.png");
		Files.copy(src, dest);
		

	}

}
