package resources;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base {
   public WebDriver driver;
   public Properties properties;
    public WebDriver initializeDriver() throws IOException {
        File file= new File("C:\\Users\\naman\\Desktop\\github automation project\\PracticeProject\\src\\main\\java\\resources\\data.properties");
        FileInputStream fileInputStream= new FileInputStream(file);
        properties= new Properties();
        properties.load(fileInputStream);
        String Browsername = properties.getProperty("Browser");
        if (Browsername.equalsIgnoreCase("chrome")){
          WebDriverManager.chromedriver().setup();
          driver=new ChromeDriver();
      } else if (Browsername.equalsIgnoreCase("firefox")) {
          WebDriverManager.firefoxdriver().setup();
          driver= new FirefoxDriver();
      }else if (Browsername.equalsIgnoreCase("ie")){
          WebDriverManager.iedriver().setup();
          driver= new InternetExplorerDriver();

      }
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//return driver;
        return driver;
    }
}
