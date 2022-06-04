package pages.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class LoginPage extends BasePage {
    //stworzyłęm super konstruktor sposobem smart
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".no-account")
    private WebElement registrationBtn;

    public void clickRegistrationBtn() {
        click(registrationBtn); //metoda z BasePage
    }

}
