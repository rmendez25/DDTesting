package Data;

import org.testng.annotations.DataProvider;

public class SearchProvider {
    @DataProvider(name = "searchProvider")
    public static Object[][] dataSet1(){
        return new Object[][]{
                {"Blouse"},
                {"Printed Dress"},
                {"Faded Short Sleeve T-shirts"}
        };
    }
}
