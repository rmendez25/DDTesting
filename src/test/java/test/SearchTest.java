package test;

import Data.SearchProvider;
import org.testng.annotations.Test;
import page.MyStoreHomePage;
import util.BaseTest;

import java.io.IOException;

public class SearchTest extends BaseTest {

    @Test(dataProvider = "searchProvider", dataProviderClass = SearchProvider.class)
    public void search(String product) throws IOException {
        MyStoreHomePage storeHomePage = new MyStoreHomePage(getDriver());
        storeHomePage.searchProduct(product);
    }

}
