package pages;

import com.beust.ah.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage{
    public static final By ADD_TO_CART_BUTTON = By.xpath("//a[text() = 'Add to cart']");

    public static final By ALERT_MESSAGE = By.xpath("//button[contains(text(), 'Click for prompt')]"));

    public ProductPage(WebDriver driver) {
        super(driver);
    }
    public ProductPage clickAddToCartButton(){
        driver.findElement(ADD_TO_CART_BUTTON).click();
        return this;
    }
    public ProductPage acceptAlert(){
        driver.findElement(ALERT_MESSAGE).click();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Текст алерта:"+ alertText);
        alert.accept();
    }
    @Override
    public boolean isPageOpen() {
        return isExist();
    }
}
