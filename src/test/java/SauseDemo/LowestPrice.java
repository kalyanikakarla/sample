package SauseDemo;

import actions.SeleniumActins;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LowestPrice {
    WebDriver driver;
    SeleniumActins actions;
    public LowestPrice(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        actions=new SeleniumActins(driver);
        this.driver=driver;
    }
    @FindBy(xpath="//div[@class='pricebar']/div[text()='7.99']/following-sibling::button[text()='Add to cart']")
    WebElement addtocartButton;
  //  @FindBy(xpath="//div[@class='pricebar']/div[text()='7.99']/following-sibling::button[text()='Remove']")*/
    public void price() {


        List<WebElement> priceList = new ArrayList<WebElement>();

        priceList = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        System.out.println(priceList);
        List<String> li1=new ArrayList<String>();
        for(int i=1;i<priceList.size();i++)
        {
            li1.add(priceList.get(i).getText());
        }
        System.out.println(li1);
        List<Float> li2=new ArrayList<Float>();

        for(String s:li1)
        {
            String str="";
            for(int i=1;i<s.length();i++)
            {
                str+=s.charAt(i);

            }
            float n=Float.valueOf(str);
            li2.add(n);
        }
        System.out.println(li2);
        System.out.println(Collections.min(li2));
        actions.clickOnElement(addtocartButton);




    }







}
