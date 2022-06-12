package pages.Checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class PaymentsCheckoutPage extends BasePage {
    public PaymentsCheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#payment-option-1")
    private WebElement payByCheckRadioButton;

    @FindBy(css = "[type='checkbox']")
    private WebElement termsOfServiceAgreementCheckbox;

    @FindBy(css = "#payment-confirmation [type='submit']")
    private WebElement placeOrderButton;


    public PaymentsCheckoutPage clickPayByCheck(){
        click(payByCheckRadioButton);
        return this;
    }

    public PaymentsCheckoutPage clickTermsOfServiceAgreementCheckbox(){
        click(termsOfServiceAgreementCheckbox);
        return this;
    }

    public PaymentsCheckoutPage clickPlaceOrder(){
        click(placeOrderButton);
        return this;
    }


}
