package user;

import base.TestBase;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.commons.TopMenuPage;
import pages.user.LoginPage;
import pages.user.RegistrationPage;

public class RegistrationTests extends TestBase {

    @Test
    public void shouldRegisterNewUser(){

        TopMenuPage topMenuPage = new TopMenuPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);

        topMenuPage.clickSignInBtn();
        loginPage.clickRegistrationBtn();
        registrationPage.setRandomGender();
        registrationPage.setFirstName("Name");
        registrationPage.setLastName("Lastname");
        registrationPage.setEmail("test@test.pl");
        registrationPage.setPassword("thisispassword");
        registrationPage.setAllCheckboxes();
        registrationPage.submitForm();

//        Assertions.assertThat(topMenuPage.getLogedUserName()).isEqualTo("Name Lastname");

    }

}
