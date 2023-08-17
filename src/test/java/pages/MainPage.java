package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPage extends BasePage{

    public static final By PRODUCT_LIST_LOCATOR = By.xpath("//h4[@class = 'card-title']/a");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage open(){
        driver.get(URL);
        return this;

    }
    public void getFirstProductFromProductList(){
        List<WebElement> productsList = driver.findElements(PRODUCT_LIST_LOCATOR);
        productsList.get(0).click();
    }

    @Override
    public boolean isPageOpen() {
        return isExist(PRODUCT_LIST_LOCATOR);
    }
}
