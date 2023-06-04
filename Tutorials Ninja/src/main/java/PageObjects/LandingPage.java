package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    WebDriver driver;
    @FindBy(xpath = "//a[@class='dropdown-toggle' and @title='My Account']")
    WebElement myAccount;
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//descendant::a[text()='Login']")
    WebElement loginOption;

    public LandingPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void clickMyAccount(){
        myAccount.click();
    }
    public void clickLoginOption(){
        loginOption.click();
    }
}
