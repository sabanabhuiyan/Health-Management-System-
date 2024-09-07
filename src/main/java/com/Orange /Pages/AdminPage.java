package com.Orange.Pages;

import com.Orange.BasesClass.BaseClass;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends BaseClass {
    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']")
    WebElement systemUserText;
    @FindBy(xpath = "//i[@class='oxd-icon bi-plus oxd-button-icon']")
    WebElement addUserLink;

    public AdminPage(){
        PageFactory.initElements (driver,this);
    }
    public boolean checkSystemUserText(){
      return  systemUserText.isDisplayed ();
    }
    public AddUserPage checkAddUserLink(){
        addUserLink.click ();
        return new AddUserPage ();
    }
}
