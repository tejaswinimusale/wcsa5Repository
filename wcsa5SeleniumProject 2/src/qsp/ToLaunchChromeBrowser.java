package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","./drivers/chromedriver.exe");
		new ChromeDriver();
	}

}

