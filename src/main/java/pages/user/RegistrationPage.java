package pages.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

import java.util.List;

public class RegistrationPage extends BasePage {
    //stworzyłęm super konstruktor sposobem smart
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[name='id_gender']")
    private List<WebElement> genderInputs;

    @FindBy(css = "[name='firstname']")
    private WebElement firstName;

    @FindBy(css = "[name='lastname']")
    private WebElement lastName;

    @FindBy(css = "[name='email']")
    private WebElement email;

    @FindBy(css = "[name='password']")
    private WebElement password;

    @FindBy(css = ".custom-checkbox")
    private List<WebElement> checkboxList;

    @FindBy(css = "footer button")
    private WebElement saveBtn;

    public RegistrationPage setRandomGender() {
        getRandomElement(genderInputs);
        return this;
    }

    public RegistrationPage setFirstName(String name) {
        sendKeys(firstName, name);
        return this;
    }

    public RegistrationPage setLastName(String name) {
        sendKeys(lastName, name);
        return this;
    }

    public RegistrationPage setEmail() {
        int random = (int)(Math.random()*1000);
        sendKeys(email,"mail"+random+"@gmail.com");
        return this;
    }

    public RegistrationPage setPassword(String password) {
        sendKeys(this.password, password);
        return this;
    }

    public RegistrationPage setAllCheckboxes() {
        for (WebElement checbox : checkboxList) {
            checbox.click();
        }
        return this;
    }

    public RegistrationPage submitForm() {
        click(saveBtn);
        return this;
    }

}
