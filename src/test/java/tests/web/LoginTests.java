package tests.web;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import tests.TestBase;
import static io.qameta.allure.Allure.step;
import static utils.TestData.*;

@Owner("Алена Порохова")
@Tag("web")
@DisplayName("Тестирование логина на сайте")
public class LoginTests extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test
    @DisplayName("Проверка спешной регистрации пользователя")
    void successfulRegistration() {
        step("Открыть главную страницу", () -> {
            loginPage.openPage();
        });
        step("Нажать на кнопку 'Signup/Login'", () -> {
            loginPage.clickLoginButton();
        });
        step("В разделе 'New User Signup!' ввести имя", () -> {
            loginPage.enterName(userName);
        });
        step("В разделе 'New User Signup!' ввести email", () -> {
            loginPage.enterEmail(userEmail);
        });
        step("Придумать пароль", () -> {
            loginPage.enterPassword(userPassword);
        });
        step("Ввести Имя", () -> {
            loginPage.enterFirstName(userFirstName);
        });
        step("Ввести Фамилию", () -> {
            loginPage.enterLastName(userLastName);
        });
        step("Ввести адрес", () -> {
            loginPage.enterAddress(userAddress);
        });
        step("Выбрать страну из выпадающего списка", () -> {
            loginPage.selectCountry(country);
        });
        step("Ввести штат", () -> {
            loginPage.enterState(state);
        });
        step("Ввести город", () -> {
            loginPage.enterCity(city);
        });
        step("Ввести индекс", () -> {
            loginPage.enterZipcode(zipcode);
        });
        step("Ввести номер телефона", () -> {
            loginPage.enterMobilePhone(mobilePhone);
        });
    step("Нажать кнопку 'Create Account'", () -> {
            loginPage.clickCreateButton();
        });
    step("Проверка успешного создания аккаунта", () -> {
            loginPage.checkResult("ACCOUNT CREATED!");
        });
    }

    @Test
    @DisplayName("Проверка логина с несуществующими данными")
    void invalidLogin() {
        step("Открыть главную страницу", () -> {
            loginPage.openPage();
        });
        step("Нажать на кнопку 'Signup/Login'", () -> {
            loginPage.clickLoginButton();
        });
        step("Ввести email для логина", () -> {
            loginPage.enterLoginEmail(userEmail);
        });
        step("Ввести пароль для логина", () -> {
            loginPage.enterLoginPassword("123");
        });
        step("Проверить отображение ошибки", () -> {
            loginPage.checkLoginResult("Your email or password is incorrect!");
        });
}
    }
