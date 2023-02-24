package SauseDemo;

import actions.SeleniumActins;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauseLogin {
    private WebDriver driver;
    SeleniumActins actions;
    public SauseLogin(WebDriver driver){
        PageFactory.initElements(driver,this);
        actions=new SeleniumActins(driver);

    }
    @FindBy(css = "#user-name")
    WebElement userInputBox;
    @FindBy(css = "#password")
    WebElement passwordInputBox;
    @FindBy(css="#login-button")
    WebElement loginButton;
    public void login(String username,String password)
    {
actions.enterValue(userInputBox,username);
actions.enterValue(passwordInputBox,password);
actions.clickOnElement(loginButton);

    }

}
