package Tests;

import PageObjects.LandingPage;
import PageObjects.Login;
import org.openqa.selenium.WebDriver;
import resources.Base;

import java.io.IOException;

public class Test extends Base {
    @org.testng.annotations.Test
    public void login() throws IOException {
       WebDriver driver= initializeDriver();
       driver.get(properties.getProperty("URL"));
        LandingPage landingPage= new LandingPage(driver);
        landingPage.clickMyAccount();
        landingPage.clickLoginOption();
        Login login= new Login(driver);
        login.setEmailaddress("naman807777@gmail.com");
        login.setPassword("12345");
        login.clickLoginButton();
    }

}
