package pages.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class TopMenuPage extends BasePage {
    //stworzyłęm super konstruktor sposobem smart
    public TopMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.user-info")
    private WebElement signInBtn;

    @FindBy(css = ".account span")
    private WebElement userName;

    @FindBy(css = ".ui-autocomplete-input")
    private WebElement searchInput;

    @FindBy(css = "button[type='submit']")
    private WebElement searchInputSubmitButton;

    public void clickSignInBtn(){
        click(signInBtn); //metoda z BasePage
    }

    public String getLogedUserName(){
        return  userName.getText();
    }

    public void setSearchText(String text){
        sendKeys(searchInput,text);
    }

    public void searchSubmit(){
        click(searchInputSubmitButton);
    }

}
