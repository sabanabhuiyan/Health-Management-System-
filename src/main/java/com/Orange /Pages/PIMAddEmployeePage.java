package com.Orange.Pages;

import com.Orange.BasesClass.BaseClass;
import com.Orange.ExcelUtility.XLxReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMAddEmployeePage extends BaseClass {

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
    WebElement addEmployeeLabel;
    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active orangehrm-firstname']")
    WebElement firstN;
    @FindBy(xpath = "//input[@placeholder='Middle Name']")
    WebElement MiddleN;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastN;
    @FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
    WebElement employeeID;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement saveButton;


    public PIMAddEmployeePage() {
        PageFactory.initElements (driver, this);
    }

    public boolean validateAddEmployeeLabel() {
        return addEmployeeLabel.isDisplayed ();
    }

    public void validateSaveButtonOfAddEmployeeLink(String fn, String ml,String ln) {
    firstN.sendKeys (fn);
    MiddleN.sendKeys (ml);
    lastN.sendKeys (ln);
    saveButton.click ();
    }
}