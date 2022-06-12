package pages.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.base.BasePage;

public class ShoppingCart extends BasePage {
    public ShoppingCart(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = ".product-line-info a")
    private WebElement producktName;

    @FindBy(css = ".js-cart-line-product-quantity")
    private WebElement productQty;

    @FindBy(css = "span.price")
    private WebElement price;

    @FindBy(css = "span.product-price strong")
    private WebElement priceX3;

    @FindBy(css = ".remove-from-cart")
    private WebElement removeIcon;

    @FindBy(css = ".no-items")
    private WebElement removeConfiramtion;

    @FindBy(css = ".checkout a")
    private WebElement checkoutBtn;

    public void checkProductName(String name){
        Assert.assertEquals(producktName.getText(),name);
    }

    public void  checkProductQty(String qty){
        Assert.assertEquals(productQty.getAttribute("value"),qty);
    }

    public void checkPrice(String price){
        Assert.assertEquals(this.price.getText(),price);
    }

    public void checkPriceX3(String price){
        Assert.assertEquals(priceX3.getText(),price);
    }

    public void removeItmesFromCart(){
        click(removeIcon);
    }

    public void emptyCartConfirmed(String confiramtion){
        waitToBeVisible(removeConfiramtion);
        Assert.assertEquals(removeConfiramtion.getText(),confiramtion);
    }

    public ShoppingCart clickCheckoutInTheCart(){
        click(checkoutBtn);
        return this;
    }
}
