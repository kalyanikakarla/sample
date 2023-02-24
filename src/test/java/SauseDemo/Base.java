package SauseDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class Base {
    public WebDriver driver;

    @BeforeSuite
    public void browserSetUp()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @BeforeClass
    public void urlSetUp()
    {
        driver.get("https://www.saucedemo.com/");
    }


}
