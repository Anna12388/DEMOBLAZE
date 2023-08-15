package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{

    public static final By PLACE_ORDER_BUTTON = By.xpath("//

    public CartPage open(){
        driver.get(URL);
        return this;

    }
    public CartPage(WebDriver driver) {
        super(driver);
    }


    @Override
    public boolean isPageOpen() {
        return false;
    }
}
