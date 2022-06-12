package pages.Checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class ShippingCheckoutPage extends BasePage {
    public ShippingCheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#js-delivery .continue")
    private WebElement contynioeBtn;

    public ShippingCheckoutPage clickContyniue(){
        click(contynioeBtn);
        return this;
    }


}
