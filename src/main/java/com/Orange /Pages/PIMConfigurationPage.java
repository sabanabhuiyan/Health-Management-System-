package com.Orange.Pages;

import com.Orange.BasesClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMConfigurationPage extends BaseClass {

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-main-title']")
    WebElement optionalFieldLabel;
    @FindBy(xpath = "//div[@class='orangehrm-card-container']" +
            "//div[1]//div[1]//div[1]//div[1]//label[1]//span[1]")
    WebElement firstCheckbox;
    @FindBy(xpath = "//div[@class='orangehrm-card-container']" +
            "//div[1]//div[1]//div[1]//div[1]//label[1]//span[1]")
    WebElement secondCheckbox;
    @FindBy(xpath = "//div[@class='orangehrm-card-container']" +
            "//div[1]//div[1]//div[1]//div[1]//label[1]//span[1]")
    WebElement thirdCheckbox;
    @FindBy(xpath = "//div[@class='orangehrm-card-container']" +
            "//div[1]//div[1]//div[1]//div[1]//label[1]//span[1]")
    WebElement fourCheckbox;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement saveButton;
    public PIMConfigurationPage(){
        PageFactory.initElements (driver,this);
    }
    public boolean validateOptionalFieldLabel(){
      return   optionalFieldLabel.isDisplayed ();
    }
    public void validateSaveButton(){
        firstCheckbox.click ();
        secondCheckbox.click ();
        thirdCheckbox.click ();
        fourCheckbox.click ();
        saveButton.click ();

    }


}
