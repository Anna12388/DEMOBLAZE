package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage{
    public static final By ADD_TO_CART_BUTTON = By.xpath("//a[text() = 'Add to cart']");

    public ProductPage(WebDriver driver) {
        super(driver);
    }
    public ProductPage clickAddToCartButton(){
        driver.findElement(ADD_TO_CART_BUTTON).click();
        return this;
    }
    public ProductPage acceptAlert(){

    }

    @Override
    public boolean isPageOpen() {
        return isExist();
    }
}
