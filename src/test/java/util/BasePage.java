package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    private static final int TIMEOUT = 20;
    private static final int POLLING = 100;
    protected Properties obj = new Properties();
    FileInputStream objPath = new FileInputStream(System.getProperty("user.dir") + "\\Object_Repo.properties\\");

    public BasePage(WebDriver driver) throws IOException {
        this.driver = driver;
        wait = new WebDriverWait(driver, TIMEOUT, POLLING);
        PageFactory.initElements(driver, this);
        obj.load(objPath);
    }

    public void waitForElementsToAppear(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
