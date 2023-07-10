package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {

	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("file:///C:/Users/ADMIN/Desktop/WCSA5/Web%20Element/MultipleSelectDropdown.html");
		    
			// identify dropdown
			WebElement dropDownElement = driver.findElement(By.id("i1"));
			
			// handle the dropDown
			Select sel = new Select(dropDownElement);
			
			// To read options from DropDown 
			WebElement allOpts = sel.getWrappedElement();
			
			System.out.println(allOpts.getText());
			
		}

	}

