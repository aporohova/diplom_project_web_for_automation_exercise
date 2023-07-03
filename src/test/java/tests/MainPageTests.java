package tests;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pages.MainPage;
import java.util.List;
import java.util.stream.Stream;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;
import static tests.TestData.userEmail;

public class MainPageTests extends TestBase {
    MainPage mainPage = new MainPage();

    static Stream<Arguments> mainMenuTest() {
        return Stream.of(
                Arguments.of(List.of(" Home", " Products", " Cart", " Signup / Login", " Test Cases", " API Testing", " Video Tutorials", " Contact us")));
    }

    @Tag("smoke")
    @Tag("Menu")
    @DisplayName("Проверка отображения меню главной страницы")
    @MethodSource
    @ParameterizedTest(name = "Меню главной страницы")
    void mainMenuTest(List<String> categories) {
        step("Открыть главную страницу", () -> {
            mainPage.openPage();
        });
        step("Проверить отображение меню главной страницы", () -> {
            $$(".nav.navbar-nav").filter(Condition.visible).shouldHave(CollectionCondition.containExactTextsCaseSensitive(categories));
        });
    }

    @Test
    @Tag("smoke")
    @Tag("Subscribe")
    @DisplayName("Оформление подписки")
    void verifySubscription() {
        step("Открыть главную страницу", () -> {
            mainPage.openPage();
        });
        step("Ввести email для подписки", () -> {
            mainPage.enterEmail(userEmail);
        });
        step("Проверить уведомление об успешной подписке", () -> {
            mainPage.checkNotification("You have been successfully subscribed!");
        });
    }

    @Test
    @Tag("smoke")
    @Tag("Redirect")
    @DisplayName("Проверка редиректа с главной страницы на youtube")
    void redirectFromMainPage() {
        step("Открыть главную страницу", () -> {
            mainPage.openPage();
        });
        step("Выбрать в меню категорию 'Video Tutorials'", () -> {
            mainPage.selectVideoCategory();
        });
        step("Проверить редирект на youtube канал в этой же вкладке'", () -> {
            mainPage.switchTo("https://www.youtube.com/c/AutomationExercise");
        });
    }
}
