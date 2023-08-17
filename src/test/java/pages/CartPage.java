package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{

    public static final By PLACE_ORDER_BUTTON = By.xpath("//button[contains(text(),'Place Order')]");


    public CartPage(WebDriver driver) {

        super(driver);
    }
    public CartPage open(){
        driver.get(URL+"cart.html");
        return this;
    }
    public CartPage clickPlaceOrderButton(){
        driver.findElement(PLACE_ORDER_BUTTON).click();
        return this;
    }


    @Override
    public boolean isPageOpen() {
        return false;
    }
}
