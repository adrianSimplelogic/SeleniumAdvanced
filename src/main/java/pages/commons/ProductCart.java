package pages.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.base.BasePage;

public class ProductCart extends BasePage {
    public ProductCart(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "#quantity_wanted")
    private WebElement quantityInput;

    @FindBy(css = ".add-to-cart")
    private WebElement addToCartBtn;

    @FindBy(css = ".cart-content-btn a")
    private WebElement proceedToCheckout;

    public void setQuantityInput(){
        sendKeysWithClear(quantityInput,"3");
    }

    public void clickAddToCartBtn(){
        click(addToCartBtn);
    }

    public void clickProceedToCheckout(){
        waitToBeVisible(proceedToCheckout);
        click(proceedToCheckout);
    }

}
