package com.Orange.Pages;

import com.Orange.BasesClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public class AddUserPage extends BaseClass {

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
    WebElement addUserTextL;
//    @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
//    WebElement selectIconA;
//    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
//    WebElement EmployeeN;
////    @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
////    WebElement selectIconB;
    @FindBy(xpath = "//div[@class='oxd-grid-2 orangehrm-full-width-grid']//input[@class='oxd-input oxd-input--focus']")
    WebElement userN;
    @FindBy(xpath = "//input[@type='password']")
    WebElement passInput;
    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and @type='password']/following::div/div")
    WebElement confirmP;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement saveBtn;

    public AddUserPage(){
        PageFactory.initElements (driver,this);
    }
    public boolean addUserTextLabel(){
       return addUserTextL.isDisplayed ();
    }
    public void checkAddingNewUser(String us,String ps,String co){

        WebElement element =driver.findElement(By.xpath ("(//div[@class='oxd-select-text oxd-select-text--active'])[1]"));
        element.click ();
        List<WebElement> list = driver.findElements (By.xpath ("//div[@class='oxd-select-option']"));
        for (WebElement webElement : list) {
            if (webElement.getText ().contains ("ESS")) {
                webElement.click ();
                break;
            }
        }
        WebElement element2 = driver.findElement (By.xpath ("(//div[@class='oxd-select-text oxd-select-text--active'])[2]"));
        element2.click ();
        List<WebElement> list1 = driver.findElements (By.xpath ("//div[@class='oxd-select-option' and@role='option']"));
        for (WebElement webElement : list1) {
            System.out.println ((list1.size ()));
            if (webElement.getText ().contains ("Enabled")) {
                webElement.click ();
                break;
            }
        }

        WebElement element3 = driver.findElement (By.xpath ("//input[@placeholder='Type for hints...']"));
        element3.sendKeys ("Lisa  Andrews");
        element3.click ();

        List<WebElement> list2 = driver.findElements (By.xpath ("//div[@class='oxd-autocomplete-option']"));
        System.out.println ( list2.size ());
        for (int l = 0; l<list2.size (); l++){
            if (list2.get (l).getText ().contains ("Lisa  Andrews")){
                list2.get (l).click ();
                break;
            }
        }

        userN.sendKeys(us);
        passInput.sendKeys (ps);
        confirmP.sendKeys (co);
        saveBtn.click ();





    }

}
