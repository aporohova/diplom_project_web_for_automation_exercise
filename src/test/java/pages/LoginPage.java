package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    SelenideElement
    loginButton = $(".fa-lock"),
    name = $("[name=name]"),
    email = $("[data-qa=signup-email]"),
    password = $("#password"),
    firstName = $("#first_name"),
    lastName = $("#last_name"),
    address = $("#address1"),
    country = $("#country"),
    state = $("#state"),
    city = $("#city"),
    zipcode = $("#zipcode"),
    mobileNumber = $("#mobile_number"),
    createAccountButton = $("[data-qa=create-account]"),
    resultCheck = $("[data-qa=account-created]"),
    emailLogin = $("[data-qa=login-email]"),
    passwordLogin = $("[data-qa=login-password]"),
    loginResultCheck = $(".login-form");

    public LoginPage openPage() {
        open("/");

        return this;
    }
    public LoginPage clickLoginButton(){
        loginButton.click();

        return this;
    }
    public LoginPage enterName(String value) {
        //name.click();
        name.setValue(value);

        return this;
    }
        public LoginPage enterEmail(String value){
            //email.click();
            email.setValue(value)
                    .pressEnter();

            return this;
        }
        public LoginPage enterPassword(String value){
            password.setValue(value);

            return this;
        }
        public LoginPage enterFirstName(String value){
            firstName.setValue(value);

            return this;
        }
        public LoginPage enterLastName(String value){
            lastName.setValue(value);

            return this;
        }
        public LoginPage enterAddress(String value){
            address.setValue(value);

            return this;
        }
        public LoginPage selectCountry(String value){
        country.click();
        country.selectOptionByValue(value);

            return this;
        }
        public LoginPage enterState(String value){
        state.setValue(value);

        return this;
        }
        public LoginPage enterCity(String value){
        city.setValue(value);

        return this;
        }
        public LoginPage enterZipcode(int value){
        zipcode.setValue(Integer.toString(value));

        return this;
        }
        public LoginPage enterMobilePhone(String value){
        mobileNumber.setValue(value);

        return this;
        }
        public LoginPage clickCreateButton(){
        createAccountButton.click();

        return this;
        }
        public LoginPage checkResult(String value){
        resultCheck.shouldHave(Condition.text(value));

        return this;
        }
        public LoginPage enterLoginEmail(String value){
        emailLogin.setValue(value);

        return this;
        }
        public LoginPage enterLoginPassword(String value){
        passwordLogin.setValue(value)
                .pressEnter();

        return this;
        }
        public LoginPage checkLoginResult(String value){
        loginResultCheck.shouldHave(Condition.text(value));

        return this;
        }
    }

