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

    public void setRandomGender(){
        getRandomElement(genderInputs);
    }

    public void setFirstName(String name){
        sendKeys(firstName,name);
    }

    public void setLastName(String name){
        sendKeys(lastName,name);
    }

    public void setEmail(String email){
        sendKeys(this.email,email);
    }

    public void setPassword(String password){
        sendKeys(this.password,password);
    }

    public void setAllCheckboxes(){
        for (WebElement checbox:checkboxList){
            checbox.click();
        }
    }

    public void submitForm(){
        click(saveBtn);
    }

}
