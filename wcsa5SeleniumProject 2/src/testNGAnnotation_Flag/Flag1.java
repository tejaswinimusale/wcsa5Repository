package testNGAnnotation_Flag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
	
	//It is use to describe the method or test case
  @Test(description = "Login Methpod!!")
  public void method1() {
	  
	  Reporter.log("Method1 from flag1!!",true);
  }
 
  @Test(description = "Login Method!!")
  public void method2() {
	  
	  Reporter.log("Method2 from flag2!!",true);
  }
 
  @Test(description = "Login Method!!")
  public void method3() {
	  
	  Reporter.log("Method3 from flag3!!",true);
  }
}