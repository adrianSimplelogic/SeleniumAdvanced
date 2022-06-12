package pages.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class HistoryOfOrdersPage extends BasePage {
    public HistoryOfOrdersPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "tbody")
    private WebElement table;

    @FindBy(css = "td [data-link-action='view-order-details']")
    private WebElement detailsLink;

    @FindBy(css = "#order-infos .box .row")
    private WebElement orderRef;

    public String getTableContent(){
        return table.getText();
    }

    public HistoryOfOrdersPage clickDetailsHistory(){
        click(detailsLink);
        return this;
    }

    public String getOrderRefText(){
        return orderRef.getText();
    }
}
