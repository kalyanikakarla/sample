package Test;

import Grid.MultipleBrowsers;
import SauseDemo.Base;
import SauseDemo.LowestPrice;
import SauseDemo.SauseLogin;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass extends Base {
    SauseLogin sauselogin;
    LowestPrice lowestPrice;
    MultipleBrowsers browsers;
    @BeforeClass
    public void intialization()
    {
        sauselogin=new SauseLogin(driver);
        lowestPrice=new LowestPrice(driver);
        browsers=new MultipleBrowsers();
    }
    @Test
    public void testExecution()
    {
        sauselogin.login("standard_user","secret_sauce");
        lowestPrice.price();
        browsers.setUp("chrome");

    }


}
