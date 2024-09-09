package com.Orange.Pages;

import com.Orange.BasesClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendResetPasswordLinkPage extends BaseClass {
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")
    WebElement successfulText;

    public SendResetPasswordLinkPage(){
        PageFactory.initElements (driver,this);
    }
    public boolean validateSuccessfulText(){
       return successfulText.isDisplayed ();
    }

}
