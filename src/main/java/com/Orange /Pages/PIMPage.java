package com.Orange.Pages;

import com.Orange.BasesClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPage extends BaseClass {

    @FindBy(xpath = "//h5[text()='Employee Information']")
    WebElement EmpInfoText;
    @FindBy(xpath = "//span[@class='oxd-topbar-body-nav-tab-item']")
    WebElement configFieldLink;
    @FindBy(xpath = "//a[normalize-space()='Optional Fields']")
    WebElement optionalFieldLink;
    @FindBy(xpath = "//a[normalize-space()='Add Employee']")
    WebElement AddEmployeeLink;
    @FindBy(xpath = "//a[normalize-space()='Employee List']")
    WebElement EmployeeListLink;

    public PIMPage(){
        PageFactory.initElements (driver,this);
    }

    public boolean validateEmpInfoText(){
       return EmpInfoText.isDisplayed ();
    }
    public EmployeeListPage validateEmployeeListLink(){
        EmployeeListLink.click ();
        return new EmployeeListPage ();
    }
    public PIMAddEmployeePage validateAddEmployeeLink(){
        AddEmployeeLink.click ();
        return new PIMAddEmployeePage ();
    }
    public PIMConfigurationPage validateConfigurationLink(){
       configFieldLink.click ();
       optionalFieldLink.click ();

        return new PIMConfigurationPage ();
    }
}
