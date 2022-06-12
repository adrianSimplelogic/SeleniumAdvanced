package user;

import base.Pages;
import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Checkout.PersonalInfoCheckoutPage;

public class checkoutTest extends Pages {

    @Test
    public void shouldChecokoutPositve() {
        homePage.getHUMMINGBIRD_T_SHIRT();
        productCart.setQuantityInput();
        productCart.clickAddToCartBtn();
        productCart.clickProceedToCheckout();

        //zadanie

        shoppingCart.clickCheckoutInTheCart();

        personalInfoCheckoutPage.setRandomGender();
        personalInfoCheckoutPage.setFirstName("Adrian");
        personalInfoCheckoutPage.setLastName("Tester");
        personalInfoCheckoutPage.setEmail();
        personalInfoCheckoutPage.setPassword("superPassword2023");
        personalInfoCheckoutPage.setAllCheckboxes();
        personalInfoCheckoutPage.clickContyniue();
        personalInfoCheckoutPage.setAdress("This is adress")
                .setCity("This is city")
                .setState(10)
                .setZipCode("40800")
//                .setCountry(0)
                .clickContyniue();
        shippingCheckoutPage.clickContyniue();
        paymentsCheckoutPage.clickPayByCheck()
                .clickTermsOfServiceAgreementCheckbox()
                .clickPlaceOrder();
        Assertions.assertThat(confirmationChecoutPage.getConfirmationText()).contains("YOUR ORDER IS CONFIRMED");
        String orderNumber = confirmationChecoutPage.getOrderNumber();
        topMenuPage.clickMyAccount()
                .clickOrderHistory();

        Assertions.assertThat(historyOfOrdersPage.getTableContent()).contains(orderNumber);

        historyOfOrdersPage.clickDetailsHistory();

        Assertions.assertThat(historyOfOrdersPage.getOrderRefText()).contains(orderNumber);

    }

}
