package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{

    public static final By PRODUCT_LIST_LOCATOR = By.xpath("//h4[@class = 'card-title']/a");
    public MainPage(WebDriver driver) {
        super(driver);
    }
    public MainPage(WebDriver)
    public MainPage open(){
        driver.get(URL);
        return this;


    }

    @Override
    public boolean isPageOpen() {
        return false;
    }
}
