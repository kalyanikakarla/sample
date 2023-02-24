package Grid;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class MultipleBrowsers {
    public WebDriver driver;
    public DesiredCapabilities desiredCapabilities;

    @Parameters({"browser"})
    @BeforeTest
    public void setUp(String browser){
        switch (browser){
            case "chrome":
                desiredCapabilities = new DesiredCapabilities();
                ChromeOptions chromeOptions = new ChromeOptions();
                desiredCapabilities.setCapability("browserName", "chrome");
                chromeOptions.merge(desiredCapabilities);
                driver =new ChromeDriver();
                driver.get("https://www.saucedemo.com/");
                try {
                    driver = new RemoteWebDriver(new URL("https://kakarlakalyani123:LGLhnIXyxUg1e4hkImh8ybq3EtjK37dsHjambcCzz4gj3UXJFM@hub.lambdatest.com/wd/hub "), chromeOptions);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;
//            case "firefox":
//                desiredCapabilities = new DesiredCapabilities();
//                FirefoxOptions firefoxOptions = new FirefoxOptions();
//                desiredCapabilities.setCapability("browserName", "firefox");
//                firefoxOptions.merge(desiredCapabilities);
//                try {
//                    driver = new RemoteWebDriver(new URL(" http://192.168.88.2:4444/wd/hub"), firefoxOptions);
//                } catch (MalformedURLException e) {
//                    e.printStackTrace();
//                }
//                break;

//            case "safari":
//                desiredCapabilities = new DesiredCapabilities();
//                SafariOptions safariOptions = new SafariOptions();
//                desiredCapabilities.setCapability("browserName", "safari");
//                safariOptions.merge(desiredCapabilities);
//                try {
//                    driver = new RemoteWebDriver(new URL(" http://172.18.3.38:4444\n"), safariOptions);
//                } catch (MalformedURLException e) {
//                    e.printStackTrace();
//                }
//                break;

            case "edge":
                desiredCapabilities = new DesiredCapabilities();
                EdgeOptions edgeOptions = new EdgeOptions();
                desiredCapabilities.setCapability("browserName", "MicrosoftEdge");
                edgeOptions.merge(desiredCapabilities);
                driver=new EdgeDriver();
                driver.get("https://www.saucedemo.com/");
                try {
                    driver = new RemoteWebDriver(new URL(" http://172.18.3.38:4444"), edgeOptions);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;


            default:
                System.out.println(" Provide a valid Browser Name ");
        }
    }


}
