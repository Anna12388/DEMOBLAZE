package pages;

import elements.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{

    public static final By PLACE_ORDER_BUTTON = By.xpath("//button[contains(text(),'Place Order')]");
    public static final By PURCHASE_BUTTON = By.xpath("//button[contains(text(), 'Purchase')]");


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
    public CartPage fillForm(){
        new Input(driver,"name").write("Test");
        new Input(driver,"country").write("Belarus");
        new Input(driver,"city").write("Minsk");
        new Input(driver,"card").write("1234567");
        new Input(driver,"month").write("july");
        new Input(driver,"year").write("2023");
    }

    public CartPage clickPurchaseButton(){
        driver.findElement(PURCHASE_BUTTON).click();
        return this;

    }


    @Override
    public boolean isPageOpen() {
        return false;
    }
}
