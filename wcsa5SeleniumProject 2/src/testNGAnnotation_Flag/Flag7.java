package testNGAnnotation_Flag;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Flag7 {
  @Test
  public void loginMethod() 
  {
	  System.out.println("It is use to perform login!!");
  }
  @Test(dependsOnMethods="loginMethod")
  public void creatUserMethod()
  {
	  Assert.fail();
	  System.out.println("It is use to create user!!");
  }
  @Test(dependsOnMethods="creatUserMethod",alwaysRun=true)
  public void logoutMethod()
  {
	  System.out.println("It is use to perform logout!!");
  }
}
