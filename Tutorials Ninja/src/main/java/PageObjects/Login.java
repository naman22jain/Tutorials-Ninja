package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver;
    @FindBy(xpath = "(//div[@class='form-group']/input)[1]")
    WebElement emailaddress;
    @FindBy(xpath = "(//div[@class='form-group']/input)[2]")
    WebElement password;
    @FindBy(xpath = "//input[@class='btn btn-primary']")
    WebElement loginButton;

    public Login(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    public void setEmailaddress(String email){
        emailaddress.sendKeys(email);
    }
    public void setPassword(String Password){
        password.sendKeys(Password);
    }
    public void clickLoginButton(){
        loginButton.click();
    }

}
