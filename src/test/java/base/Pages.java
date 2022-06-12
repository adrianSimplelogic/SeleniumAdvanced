package base;

import org.testng.annotations.BeforeMethod;
import pages.Checkout.*;
import pages.commons.*;
import pages.user.*;

public class Pages extends TestBase{

    //commons
    public HomePage homePage;
    public ProductCart productCart;
    public SearchResults searchResults;
    public ShoppingCart shoppingCart;
    public TopMenuPage topMenuPage;
    //user
    public LoginPage loginPage;
    public RegistrationPage registrationPage;
    public AddressCheckoutPage addressCheckoutPage;
    public ConfirmationChecoutPage confirmationChecoutPage;
    public PaymentsCheckoutPage paymentsCheckoutPage;
    public PersonalInfoCheckoutPage personalInfoCheckoutPage;
    public ShippingCheckoutPage shippingCheckoutPage;
    public HistoryOfOrdersPage historyOfOrdersPage;
    public MyAccountPage myAccountPage;
    public OrderDetailsPage orderDetailsPage;
    public CategoryPage categoryPage;

    @BeforeMethod
    public void pahesSetup(){
        homePage = new HomePage(driver);
        productCart = new ProductCart(driver);
        searchResults = new SearchResults(driver);
        shoppingCart = new ShoppingCart(driver);
        topMenuPage = new TopMenuPage(driver);
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        addressCheckoutPage = new AddressCheckoutPage(driver);
        confirmationChecoutPage = new ConfirmationChecoutPage(driver);
        paymentsCheckoutPage = new PaymentsCheckoutPage(driver);
        personalInfoCheckoutPage = new PersonalInfoCheckoutPage(driver);
        shippingCheckoutPage = new ShippingCheckoutPage(driver);
        historyOfOrdersPage = new HistoryOfOrdersPage(driver);
        myAccountPage = new MyAccountPage(driver);
        orderDetailsPage = new OrderDetailsPage(driver);
        categoryPage = new CategoryPage(driver);
    }

}
