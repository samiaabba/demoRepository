package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("this is test annotation");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is BeforClass annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is AfterClass annotation");
	  
  }

}
