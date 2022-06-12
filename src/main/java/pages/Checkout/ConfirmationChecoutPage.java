package pages.Checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class ConfirmationChecoutPage extends BasePage {
    public ConfirmationChecoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#content-hook_order_confirmation h3.card-title")
    private WebElement orderConfirmation;

    @FindBy(css = "#order-details ul li:first-child")
    private WebElement orderNumber;

    public String getConfirmationText(){
        return orderConfirmation.getText();
    }

    public String getOrderNumber(){
        String yourOrder = orderNumber.getText().replace("Order reference: ","");
        return yourOrder;
    }
}
