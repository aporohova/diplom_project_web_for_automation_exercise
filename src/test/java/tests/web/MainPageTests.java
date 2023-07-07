package tests.web;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pages.MainPage;
import tests.TestBase;
import java.util.List;
import java.util.stream.Stream;
import static io.qameta.allure.Allure.step;
import static utils.TestData.userEmail;

@Owner("Алена Порохова")
@Tag("web")
public class MainPageTests extends TestBase {
    MainPage mainPage = new MainPage();
    static Stream<Arguments> mainMenuTest() {
        return Stream.of(
                Arguments.of(List.of("Home", "\uE8F8 Products", "Cart", "Signup / Login", "Test Cases", "API Testing", "Video Tutorials", "Contact us")));
    }

    @DisplayName("Проверка отображения меню главной страницы")
    @MethodSource
    @ParameterizedTest(name = "header меню")
    void mainMenuTest(List<String> categories) {
        step("Открыть главную страницу", () -> {
            mainPage.openPage();
        });
        step("Проверить отображение меню главной страницы", () -> {
            mainPage.checkMenu(categories);
        });
    }

    @Test
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
