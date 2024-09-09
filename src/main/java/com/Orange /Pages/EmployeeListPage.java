package com.Orange.Pages;

import com.Orange.BasesClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeListPage extends BaseClass {

    @FindBy(xpath ="//a[normalize-space()='Add Employee']")
    WebElement addEmpLink;

    public EmployeeListPage(){
        PageFactory.initElements (driver,this);
    }
    public PIMAddEmployeePage validateAddEmpLink(){
        addEmpLink.click ();
        return new PIMAddEmployeePage ();
    }
}
