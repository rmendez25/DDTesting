package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import util.BasePage;

import java.io.IOException;

public class MyStoreHomePage extends BasePage {

    public MyStoreHomePage(WebDriver driver) throws IOException {
        super(driver);
    }

    public void searchProduct(String product){
        waitForElementsToAppear(driver.findElement(By.xpath(obj.getProperty("myStore.logo.xpath"))));
        driver.findElement(By.id(obj.getProperty("myStore.searchBar.id"))).sendKeys(product);
        driver.findElement(By.id(obj.getProperty("myStore.searchBar.id"))).submit();
        driver.findElement(By.xpath(obj.getProperty("myStore.logo.xpath"))).click();
        waitForElementsToAppear(driver.findElement(By.xpath(obj.getProperty("myStore.banner.xpath"))));
    }
}
