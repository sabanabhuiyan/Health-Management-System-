package com.Orange.Pages;

import com.Orange.BasesClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement searchBox;
    @FindBy(xpath = "//li[1]//a[1]//span[1]")
    WebElement adminLink;
    @FindBy(xpath = "//span[normalize-space()='PIM']")
    WebElement PIMLink;
    @FindBy(xpath = "//span[normalize-space()='Time']")
    WebElement timeLink;
    @FindBy(xpath = "//span[normalize-space()='Recruitment']")
    WebElement recruitmentLink;
    @FindBy(xpath = "//span[normalize-space()='My Info']")
    WebElement myInfoLink;
    @FindBy(xpath = "//span[normalize-space()='Performance']")
    WebElement performanceLink;
    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span" +
            " oxd-main-menu-item--name'][normalize-space()='Dashboard']")
    WebElement dashboardLink;
    @FindBy(xpath = "//span[normalize-space()='Directory']")
    WebElement directoryLink;
    @FindBy(xpath = "//span[normalize-space()='Maintenance']")
    WebElement maintenanceLink;
    @FindBy(xpath = "//span[normalize-space()='Buzz']")
    WebElement buzzLink;
    @FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
    WebElement userDropdownIconLink;
    @FindBy(xpath = "//a[normalize-space()='About']")
    WebElement aboutLink;
    @FindBy(xpath = "//a[normalize-space()='Support']")
    WebElement supportLink;
    @FindBy(xpath = "//a[normalize-space()='Change Password']")
    WebElement changePasswordLink;
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logoutLink;

    public HomePage(){
        PageFactory.initElements (driver,this);
    }
    public String checkTitle(){
       return driver.getTitle ();
    }
    public String checkSearchBox(String sb){
       searchBox.sendKeys (sb);
       return "Admin";
    }
    public AdminPage checkAdminLink(){
       adminLink.click ();
       return new AdminPage();
    }
    public PIMPage checkPIMLink(){
        PIMLink.click ();
        return new PIMPage ();
    }
    public TimePage checkTimeLink(){
        timeLink.click ();
        return new TimePage ();
    }
    public RecruitmentPage checkRecruitmentLink(){
        recruitmentLink.click ();
        return new RecruitmentPage ();
    }
    public MyInfoPage checkMyInfoLink(){
        myInfoLink.click ();
        return new MyInfoPage ();
    }
    public PerformancePage checkPerformanceLink(){
        performanceLink.click ();
        return new PerformancePage ();
    }
    public HomePage checkDashboardLink(){
        dashboardLink.click ();
        return new HomePage ();
    }
    public DirectoryPage checkDirectoryLink(){
        directoryLink.click ();
        return new DirectoryPage ();
    }
    public MaintenancePage checkMaintenanceLink(){
        maintenanceLink.click ();
        return new MaintenancePage ();
    }
    public BuzzPage checkBuzzLink(){
        buzzLink.click ();
        return new BuzzPage ();
    }
    public boolean checkUserDropdownIcon(){
        userDropdownIconLink.click ();
        return userDropdownIconLink.isDisplayed ();
    }
    public CompanyNamePage checkAboutLink(){
        aboutLink.click ();
        return new CompanyNamePage ();
    }
    public SupportPage checkSupportLink(){
        supportLink.click ();
        return new SupportPage ();
    }
    public ChangePasswordPage checkChangePasswordLink(){
        changePasswordLink.click ();
        return new ChangePasswordPage ();
    }
    public LoginPage checkLogoutLink(){
        logoutLink.click ();
        return new LoginPage ();
    }



}
