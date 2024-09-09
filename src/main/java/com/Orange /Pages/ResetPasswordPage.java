package com.Orange.Pages;

import com.Orange.BasesClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPasswordPage extends BaseClass {
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement resetUserName;
    @FindBy(xpath = "//button[@type='button']")
    WebElement cancelButt;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement RePassLink;

    public ResetPasswordPage(){
        PageFactory.initElements (driver,this);
    }
    public LoginPage validateCancelLink(){
        cancelButt.click ();
        return new LoginPage ();
    }
    public SendResetPasswordLinkPage validateResetPasswordButtonLink(String rus){
        resetUserName.sendKeys (rus);
        RePassLink.click ();
        return new SendResetPasswordLinkPage ();
    }
}
