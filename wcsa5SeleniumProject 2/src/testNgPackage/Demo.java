package testNgPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void demoMethod() {
	  //System.out.println();
	  Reporter.log("Hii TestNG!!", true);
  }
}
