package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLauchFirefoxBrowser {


	public static void main(String[] args) {
		System.setProperty("WebDriver.gecko.driver","./drivers/geckodriver.exe");
		new FirefoxDriver();
	}

}



