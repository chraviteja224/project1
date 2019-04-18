package script;

//import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;

public class DemoA extends BaseTest {
     @Test
     public void ValidLogin() {
    	 Reporter.log("Executing DemoA", true);
    	 //Assert.fail();
     }
     
}
