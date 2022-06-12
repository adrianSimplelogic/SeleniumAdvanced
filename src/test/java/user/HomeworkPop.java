package user;

import base.Pages;
import base.TestBase;
import org.testng.annotations.Test;
import pages.commons.*;

public class HomeworkPop extends Pages {

    @Test
    public void searchForProduct() {
//        TopMenuPage topMenuPage = new TopMenuPage(driver);
//        HomePage homePage = new HomePage(driver);
//        SearchResults searchResults = new SearchResults(driver);

        String searchedItem = homePage.getRandomPopularProductTitle();
        topMenuPage.setSearchText(searchedItem);
        topMenuPage.searchSubmit();
        searchResults.findSearchedProduckt(searchedItem);

    }

    @Test
    public void shouldAddCheckAndRemoveItemFromCart() {
//        HomePage homePage = new HomePage(driver);
//        ProductCart productCart = new ProductCart(driver);
//        ShoppingCart shoppingCart = new ShoppingCart(driver);

        homePage.getHUMMINGBIRD_T_SHIRT();
        productCart.setQuantityInput();
        productCart.clickAddToCartBtn();
        productCart.clickProceedToCheckout();
        shoppingCart.checkProductName("HUMMINGBIRD T-SHIRT");
        shoppingCart.checkProductQty("3");
        shoppingCart.checkPrice("$19.12");
        shoppingCart.checkPriceX3("$57.36");
        shoppingCart.removeItmesFromCart();
        shoppingCart.emptyCartConfirmed("There are no more items in your cart");
    }

}
