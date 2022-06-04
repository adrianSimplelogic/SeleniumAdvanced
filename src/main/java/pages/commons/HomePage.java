package pages.commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".product-title")
    private List<WebElement> popularProductsTitles;

    public String getRandomPopularProductTitle(){
        String randomTitle = getRandomElement(popularProductsTitles).getText();
        return randomTitle;
    }

    public void getHUMMINGBIRD_T_SHIRT(){
        String targetItem = "HUMMINGBIRD T-SHIRT";
        String item;
        for (WebElement el:popularProductsTitles){
            item = el.getText();
            if (item.equals(targetItem)){
                click(el);
                return;
            }
        }
    }
}
