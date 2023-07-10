package qsp;

import org.openqa.selenium.edge.EdgeDriver;

public class ToLaunchMicrosoftEdge {
	public class ToLaunchEdgeBrowser {

		public static void main(String[] args) {
			System.setProperty("WebDriver.chrome.driver","./drivers/chromedriver.exe");
			new EdgeDriver();
		}

	}


}
