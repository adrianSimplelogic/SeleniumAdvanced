package pages.Checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.user.RegistrationPage;

public class PersonalInfoCheckoutPage extends RegistrationPage {
    public PersonalInfoCheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[name='address1']")
    private WebElement adress;

    @FindBy(css = "[name='city']")
    private WebElement city;

    @FindBy(css = "[name='id_state']")
    private WebElement state;

    @FindBy(css = "[name='postcode']")
    private WebElement zipCode;

    @FindBy(css = "[name='id_country']")
    private WebElement country;

    @FindBy(css = "footer [type='submit']")
    private WebElement contyniueBtn;


    public PersonalInfoCheckoutPage setAdress(String adress){
        waitToBeVisible(this.adress);
        sendKeysWithClear(this.adress,adress);
        return this;
    }

    public PersonalInfoCheckoutPage setCity(String city){
        sendKeysWithClear(this.city,city);
        return this;
    }

    public PersonalInfoCheckoutPage setState(int stateIndex){
        Select select = new Select(state);
        select.selectByIndex(stateIndex);
        return this;
    }

    public PersonalInfoCheckoutPage setZipCode(String code){
        sendKeysWithClear(zipCode,code);
        return this;
    }

    public PersonalInfoCheckoutPage setCountry(int countryIndex){
        Select select = new Select(state);
        select.selectByIndex(countryIndex);
        return this;
    }

    public PersonalInfoCheckoutPage clickContyniue(){
        click(contyniueBtn);
        return this;
    }


}


