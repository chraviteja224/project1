package script;



//import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
//import generic.FWUtil;

public class TestBaseClass extends BaseTest {
    @Test
    public void testA() {
    	
    	
    	//FWUtil.getPhoto(driver, "./screenshots/google.png");
    	Reporter.log("test",true);
    	
    }
}
