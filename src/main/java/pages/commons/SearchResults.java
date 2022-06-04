package pages.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.base.BasePage;

import java.util.List;

public class SearchResults extends BasePage {
    public SearchResults(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".product-title")
    private List<WebElement> searchedProductsList;

    public void findSearchedProduckt(String searchedItem){
                String item = "no match";
        for (WebElement product:searchedProductsList){
            if (product.getText().equals(searchedItem)){
                item = product.getText();
            }
        }
        Assert.assertEquals(searchedItem,item);
    }

}
