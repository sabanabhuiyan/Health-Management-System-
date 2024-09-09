package com.Orange.Pages;

import com.Orange.BasesClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
//    Repository objects (RO)
    @FindBy(name = "username")
    WebElement userName;
    @FindBy(name = "password")
    WebElement passName;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
    WebElement forgotPassword;
    @FindBy(xpath = "//img[@alt='company-branding']")
    WebElement OrangeImage;
    @FindBy(xpath = "//div[@class='orangehrm-login-slot-wrapper']")
    WebElement hrmLoginImage;

//    pageFactory constructor;
    public LoginPage(){
        PageFactory.initElements (driver,this);
    }
//    Action methods:
    public String validatePageTitle(){
        return driver.getTitle ();
    }
    public boolean validateOrangeImage(){
      return  OrangeImage.isDisplayed ();
    }
    public boolean validateHrmLoginImage(){
       return hrmLoginImage.isDisplayed ();
    }
    public ResetPasswordPage validateResetPasswordLink(){
        forgotPassword.click ();
        return new ResetPasswordPage ();
    }
    public HomePage validateLoginButton(String us, String pw){
        userName.sendKeys (us);
        passName.sendKeys (pw);
        loginButton.click ();
        return new HomePage ();
    }

}
