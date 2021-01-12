package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public WebDriver driver;
    String driverPath = System.getProperty("user.dir") + "\\driver\\chromedriver.exe\\";
    String url = "http://automationpractice.com/index.php";

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @AfterClass
    public void cleanUp(){
        if (driver != null){
            driver.close();
            driver.quit();
        }
    }

    public WebDriver getDriver(){
        return driver;
    }
}
